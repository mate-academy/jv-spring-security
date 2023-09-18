package mate.academy.spring.exception;

public class PasswordAuthException extends RuntimeException {
    public PasswordAuthException(String message) {
        super(message);
    }
}
