package mate.academy.spring.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class EmailValidator implements ConstraintValidator<Email, String> {
    public static final String VALID_EMAIL_PATTERN
            = "^(\\S+)(@)(\\S+)(\\.)([a-zA-Z]{2,4})$";

    @Override
    public boolean isValid(String email, ConstraintValidatorContext context) {
        return email != null && email.matches(VALID_EMAIL_PATTERN);
    }
}
