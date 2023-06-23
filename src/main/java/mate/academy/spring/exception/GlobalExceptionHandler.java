package mate.academy.spring.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<String> handleRuntimeException(RuntimeException ex) {
        return new ResponseEntity<>("A runtime exception occurred: "
                + ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(DataProcessingException.class)
    public ResponseEntity<String> handleDataProcessingException(DataProcessingException ex) {
        return new ResponseEntity<>("A data processing exception occurred: "
                + ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler
    public ResponseEntity<String> handleException(Exception ex) {
        return new ResponseEntity<>("Unknown exception occurred: "
                + ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
