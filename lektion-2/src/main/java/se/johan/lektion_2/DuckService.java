package se.johan.lektion_2;


import reactor.core.publisher.Mono;

public interface DuckService {

    Mono<Duck> getDuck(String message, String url);
}
