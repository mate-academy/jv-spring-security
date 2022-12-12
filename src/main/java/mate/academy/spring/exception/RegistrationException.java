package mate.academy.spring.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.BAD_REQUEST, reason = "Can't register")
public class RegistrationException extends RuntimeException {
    public RegistrationException(String message) {
        super(message);
    }
}
