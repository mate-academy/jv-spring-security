package mate.academy.spring.controller;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class CustomGlobalExceptionHandler extends ResponseEntityExceptionHandler {

    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(
            MethodArgumentNotValidException ex,
            HttpHeaders headers,
            HttpStatus status,
            WebRequest request) {

        Map<String, Object> bodyOfResponse = new HashMap<>();
        bodyOfResponse.put("timestamp", LocalDateTime.now());
        bodyOfResponse.put("status", status);
        List<String> errors = ex.getBindingResult().getAllErrors().stream()
                .map(this::getErrorMessage)
                .collect(Collectors.toList());
        bodyOfResponse.put("errors", errors);
        return new ResponseEntity<>(bodyOfResponse, headers, status);
    }

    private String getErrorMessage(ObjectError e) {
        if (e instanceof FieldError) {
            return ((FieldError) e).getField() + " " + e.getDefaultMessage();
        }
        return e.getDefaultMessage();
    }

    @ExceptionHandler(value = { DataProcessingException.class })
    protected ResponseEntity<Object> handleConflict(
            RuntimeException ex, WebRequest request) {
        Map<String, Object> bodyOfResponse = new HashMap<>();
        bodyOfResponse.put("timestamp", LocalDateTime.now());
        bodyOfResponse.put("status", HttpStatus.INTERNAL_SERVER_ERROR);
        bodyOfResponse.put("Exception.Message", ex.getMessage());
        return handleExceptionInternal(ex, bodyOfResponse,
                new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR, request);
    }
}
