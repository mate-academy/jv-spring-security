package mate.academy.spring.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class EmailValidator implements ConstraintValidator<Email, String> {
    private static final String EMAIL_PATTERN =
            "^([\\w-\\.]+){1,64}@([\\w&&[^_]]+){2,255}.[a-z]{2,}$";

    @Override
    public boolean isValid(String email, ConstraintValidatorContext context) {
        return email != null && email.matches(EMAIL_PATTERN);
    }
}
