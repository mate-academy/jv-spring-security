package mate.academy.spring.service.validation.impl;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import mate.academy.spring.service.validation.Email;

public class EmailValidator implements ConstraintValidator<Email, String> {
    private static final String EMAIL_FORMAT_REGEX = "^[^\\s@]+@([^\\s@.,]+\\.)+[^\\s@.,]{2,}$";

    @Override
    public boolean isValid(String email, ConstraintValidatorContext constraintValidatorContext) {
        return email != null
                && email.length() > 9
                && email.matches(EMAIL_FORMAT_REGEX);
    }
}
