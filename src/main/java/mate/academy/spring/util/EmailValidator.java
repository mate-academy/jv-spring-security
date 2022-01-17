package mate.academy.spring.util;

import org.springframework.stereotype.Component;

@Component
public class EmailValidator {
    private static final String EMAIL_PATTERN = "\\b[A-Z0-9._%-]+@[A-Z0-9.-]+\\.[A-Z]{2,4}\\b";

    public boolean isValid(String email) {
        return !email.isEmpty() && email.matches(EMAIL_PATTERN);
    }
}
