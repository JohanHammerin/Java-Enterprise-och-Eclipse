package se.johan.lektion_4.message.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.time.LocalDateTime;

public record MessageResponseDTO(
        String message,
        boolean pinned,
        LocalDateTime createdAt
) {
}
