package se.johan.lektion_4.message;

import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDateTime;
@Table("messages")
public record Message(
        Long id,
        String message,
        boolean pinned,
        LocalDateTime createdAt

) {

}
