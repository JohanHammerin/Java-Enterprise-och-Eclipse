package se.johan.lektion_3.product.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record NameProductDTO(
        @NotBlank
        @Size(min = 2)
        String name) {
}
