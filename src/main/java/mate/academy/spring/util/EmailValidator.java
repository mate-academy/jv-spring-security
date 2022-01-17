package mate.academy.spring.util;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import org.springframework.stereotype.Component;

@Component
public class EmailValidator implements ConstraintValidator<Email, String> {
    private static final String EMAIL_PATTERN = "\\b[A-Z0-9._%-]+@[A-Z0-9.-]+\\.[A-Z]{2,4}\\b";

    @Override
    public boolean isValid(String email, ConstraintValidatorContext context) {
        return !email.isEmpty() && email.matches(EMAIL_PATTERN);
    }
}
