package mate.academy.spring.controller;

import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.Map;
import mate.academy.spring.exception.DataProcessingException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class CustomGlobalExceptionHandler extends ResponseEntityExceptionHandler {
    @ExceptionHandler(DataProcessingException.class)
    protected ResponseEntity<Object> handleExceptionInternal(DataProcessingException ex,
                                                             Object body,
                                                             HttpHeaders headers,
                                                             HttpStatus status) {
        Map<String, Object> responseBody = new LinkedHashMap<>();
        responseBody.put("timestamp", LocalDateTime.now().toString());
        responseBody.put("status", 500);
        responseBody.put("message", ex.getMessage());
        return new ResponseEntity<>(body, headers, status);
    }
}
