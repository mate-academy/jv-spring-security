package mate.academy.spring.lib;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class EmailValidator implements ConstraintValidator<Email, String> {
    private static final String EMAIL_PATTERN = "^[\\w-_.+]*[\\w-_.]@([\\w]+\\.)+[\\w]+[\\w]$";

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return value != null && value.matches(EMAIL_PATTERN);
    }
}
