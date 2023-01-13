package mate.academy.spring.exception;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class CustomGlobalExceptionHandler extends ResponseEntityExceptionHandler {
    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(
            MethodArgumentNotValidException ex, HttpHeaders headers,
            HttpStatus status, WebRequest request) {
        Map<String, Object> handlerException = new HashMap<>();
        handlerException.put("errorTime", LocalDateTime.now());
        handlerException.put("status", status);
        List<String> errorMessage = ex.getAllErrors()
                .stream()
                .map(this::errorMessage)
                .collect(Collectors.toList());
        handlerException.put("errors", errorMessage);
        return new ResponseEntity<>(handlerException, headers, status);
    }

    private String errorMessage(ObjectError objectError) {
        if (objectError instanceof FieldError) {
            String field = ((FieldError) objectError).getField();
            return field + " " + objectError.getDefaultMessage();
        }
        return objectError.getDefaultMessage();
    }
}
