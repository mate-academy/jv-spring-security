package mate.academy.spring.exception;

import java.time.LocalDateTime;
import java.util.LinkedHashMap;
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
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {
    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(
            MethodArgumentNotValidException ex,
            HttpHeaders headers,
            HttpStatus status,
            WebRequest request) {
        Map<String, Object> mapps = new LinkedHashMap<>();
        mapps.put("timestamp", LocalDateTime.now());
        mapps.put("status", status.value());
        List<String> errorList = ex.getBindingResult()
                .getAllErrors()
                .stream()
                .map(this::getError)
                .collect(Collectors.toList());
        mapps.put("errors", errorList);
        return new ResponseEntity<>(mapps, headers, status);
    }

    private String getError(ObjectError err) {
        if (err instanceof FieldError) {
            return ((FieldError) err).getField() + err.getDefaultMessage();
        }
        return err.getDefaultMessage();
    }
}
