package mate.academy.spring.controller;

import static mate.academy.spring.util.DateTimePatternUtil.DATE_TIME_PATTERN;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import mate.academy.spring.exception.DataProcessingException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class CustomGlobalExceptionHandler extends ResponseEntityExceptionHandler {
    private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DATE_TIME_PATTERN);

    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(
            MethodArgumentNotValidException ex,
            HttpHeaders headers,
            HttpStatus status,
            WebRequest request) {
        Map<String, Object> errorsMap = new LinkedHashMap<>();
        errorsMap.put("Timestamp: ", LocalDateTime.now().format(formatter));
        errorsMap.put("Status: ", status.value());
        Collection<String> errorsList = ex.getAllErrors()
                .stream()
                .map(this::getErrorMessage)
                .toList();
        errorsMap.put("Errors", errorsList);
        return new ResponseEntity<>(errorsMap, headers, status);
    }

    @ResponseBody
    public ResponseEntity<Object> handleDataProcessingException(DataProcessingException ex) {
        Map<String, Object> errorsMap = new LinkedHashMap<>();
        errorsMap.put("TimeStamp", LocalDateTime.now().format(formatter));
        errorsMap.put("Status", HttpStatus.INTERNAL_SERVER_ERROR.value());
        errorsMap.put("Error", ex.getMessage());
        return new ResponseEntity<>(errorsMap, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    private String getErrorMessage(ObjectError e) {
        if (e instanceof FieldError) {
            return ((FieldError) e).getField() + " " + e.getDefaultMessage();
        }
        return e.getDefaultMessage();
    }
}
