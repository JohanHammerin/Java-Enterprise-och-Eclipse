package se.johan.lektion_3.product.dto;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.math.BigDecimal;

public record ProductDTO(
        @NotBlank
        @Size(min = 2)
        String name,
        @NotNull
        @DecimalMin(value = "0.01", inclusive = true, message = "Price must be at least 0.01")
        BigDecimal price) {
}
