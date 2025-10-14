package se.johan.lektion_3.advice;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;

@RestControllerAdvice
public class ValidationAdvice {
    public ResponseEntity<HashMap<String, String>> handleValidationErrorsBoring (
            MethodArgumentNotValidException exception
    ) {
        HashMap<String, String> errors = new HashMap<>();
        exception
                .getBindingResult()
                .getFieldErrors()
                .forEach(fieldError -> errors.put(
                        fieldError.getField(),
                        fieldError.getDefaultMessage())
                );
        return ResponseEntity.badRequest().body(errors);
    }
}
