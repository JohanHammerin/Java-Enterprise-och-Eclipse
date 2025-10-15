package se.johan.lektion_4.message.objectMapper;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import se.johan.lektion_4.message.Message;
import se.johan.lektion_4.message.dto.MessageCreationDTO;

import java.time.LocalDateTime;

@Component
public class MessageMapper {

    public Message toEntity(MessageCreationDTO messageCreationDTO) {
        return new Message(
                null,
                messageCreationDTO.message(),
                messageCreationDTO.pinned(),
                LocalDateTime.now()
        );
    }
}
