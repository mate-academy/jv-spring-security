package mate.academy.spring.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class EmailValidator implements ConstraintValidator<ValidEmail, String> {
    private static final String EMAIL_PATTERN
            = "^([\\w\\-.]+){1,64}@([\\w&&[^_]]+){2,255}.[a-z]{2,}$";

    @Override
    public boolean isValid(
            String email,
            ConstraintValidatorContext constraintValidatorContext) {
        if (email == null) {
            return false;
        }
        return email.matches(EMAIL_PATTERN);
    }
}
