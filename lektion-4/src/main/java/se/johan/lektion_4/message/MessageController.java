package se.johan.lektion_4.message;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;
import se.johan.lektion_4.message.dto.MessageCreationDTO;

@RequestMapping("api/v1/message")
@RestController
public class MessageController {
    private final MessageService messageService;

    @Autowired
    public MessageController(MessageService messageService) {
        this.messageService = messageService;
    }

    @PostMapping("/create")
    public Mono<ResponseEntity<Message>> createMessage(@Valid @RequestBody MessageCreationDTO messageCreationDTO) {
        return messageService.createMessage(messageCreationDTO)
                .map(message -> ResponseEntity
                        .status(HttpStatus.CREATED)
                        .body(message)
                );


    }
}
