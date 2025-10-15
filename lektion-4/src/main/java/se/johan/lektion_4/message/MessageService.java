package se.johan.lektion_4.message;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;
import se.johan.lektion_4.message.dto.MessageCreationDTO;
import se.johan.lektion_4.message.objectMapper.MessageMapper;

@Service
public class MessageService {
    private final MessageRepository messageRepository;
    private final MessageMapper messageMapper;
    private final Logger logger = LoggerFactory.getLogger(this.getClass());


    @Autowired
    public MessageService(MessageRepository messageRepository, MessageMapper messageMapper) {
        this.messageRepository = messageRepository;
        this.messageMapper = messageMapper;
    }

    public Mono<Message> createMessage(MessageCreationDTO messageCreationDTO) {

        logger.info("New Message was created & saved");


        return messageRepository.save(messageMapper.toEntity(messageCreationDTO));
    }

}
