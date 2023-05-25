package mate.academy.spring.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value= HttpStatus.INTERNAL_SERVER_ERROR, reason="Internal Server Error")
public class DataProcessingException extends RuntimeException {
    public DataProcessingException(String message, Throwable cause) {
        super(message, cause);
    }
}
