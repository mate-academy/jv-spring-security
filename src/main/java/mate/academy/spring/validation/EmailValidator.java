package mate.academy.spring.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class EmailValidator implements ConstraintValidator<Email, String> {
    private static final String EMAIL_PATTERN = "/^((([0-9A-Za-z]{1}[-0-9A-z\\.]{1,}"
            + "[0-9A-Za-z]{1})|([0-9А-Яа-я]{1}[-0-9А-я\\.]{1,}[0-9А-Яа-я]{1}))"
            + "@([-A-Za-z]{1,}\\.){1,2}[-A-Za-z]{2,})$/u";

    @Override
    public boolean isValid(String email, ConstraintValidatorContext constraintValidatorContext) {
        return (email != null) && (email.matches(EMAIL_PATTERN));
    }
}
