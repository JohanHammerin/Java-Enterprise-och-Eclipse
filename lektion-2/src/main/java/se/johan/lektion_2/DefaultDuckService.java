package se.johan.lektion_2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class DefaultDuckService implements DuckService{

    private final WebClient webClient;

    @Autowired
    public DefaultDuckService(WebClient webClient) {
        this.webClient = webClient;
    }


    @Override
    public Mono<Duck> getDuck(String message, String url) {
        return webClient.get()
                .uri(uriBuilder -> uriBuilder
                        .queryParam("message", message)
                        .queryParam("url", url)
                        .build()
                )
                .retrieve()
                .onStatus(
                        HttpStatusCode::is4xxClientError,
                        clientResponse -> Mono.error(new RuntimeException("Not Found"))

                )
                .bodyToMono(Duck.class);
    }
}
