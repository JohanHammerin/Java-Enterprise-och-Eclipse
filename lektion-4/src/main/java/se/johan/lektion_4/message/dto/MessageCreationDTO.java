package se.johan.lektion_4.message.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record MessageCreationDTO(
        @Size(min = 1, max = 255, message = "Check the message length")
        @NotBlank(message = "Message cannot be blank or contain pure whitespaces")
        String message,
        @NotNull
        boolean pinned
) {
}
