package mate.academy.spring.controller;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Properties;
import java.util.stream.Collectors;
import mate.academy.spring.exception.DataProcessingException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class CustomGlobalExceptionHandler extends ResponseEntityExceptionHandler {
    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(
            MethodArgumentNotValidException ex,
            HttpHeaders headers,
            HttpStatus status,
            WebRequest request
    ) {
        Properties body = new Properties();
        body.put("timestamp", LocalDateTime.now().toString());
        body.put("status", status.value());

        List<String> errors = ex.getBindingResult()
                .getAllErrors()
                .stream()
                .map(this::getErrorMessage)
                .collect(Collectors.toList());

        body.put("errors", errors);

        return new ResponseEntity<>(body, headers, status);
    }

    @ExceptionHandler(DataProcessingException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ResponseEntity<Object> handleDataProcessingException(
            DataProcessingException ex,
            WebRequest request
    ) {
        Properties body = new Properties();
        body.put("exception", "Exception: " + ex.getClass().getName());
        body.put("message", ex.getCause().getMessage());
        body.put("status", HttpStatus.INTERNAL_SERVER_ERROR.value());

        return new ResponseEntity<>(body, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    private String getErrorMessage(ObjectError e) {
        if (e instanceof FieldError) {
            String field = ((FieldError) e).getField();
            return field + ": " + e.getDefaultMessage();
        }

        return e.getDefaultMessage();
    }
}
