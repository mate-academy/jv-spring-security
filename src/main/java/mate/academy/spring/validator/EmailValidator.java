package mate.academy.spring.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class EmailValidator implements ConstraintValidator<ValidEmail, String> {
    private static final String EMAIL_VALIDATION_PATTERN = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\\\.[A-Z]$";

    @Override
    public boolean isValid(String email,
                           ConstraintValidatorContext constraintValidatorContext) {
        return email != null && email.matches(EMAIL_VALIDATION_PATTERN);
    }
}
