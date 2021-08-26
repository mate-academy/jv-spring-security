package mate.academy.spring.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import javax.validation.constraints.Email;

public class EmailValidator implements ConstraintValidator<Email, String> {
    private static final String EMAIL_PATTERN =
            "^([\\w-\\.]+){8,40}@([\\w&&[^_]]+){2,255}.[a-z]{2,}$";

    @Override
    public boolean isValid(String mail, ConstraintValidatorContext constraintValidatorContext) {
        return mail != null && mail.matches(EMAIL_PATTERN);
    }
}
