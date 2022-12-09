package mate.academy.spring.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class EmailValidator implements ConstraintValidator<Email, String> {
    private static final String EMAIL_REGEX = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\\\.[A-Za-z0-9_-]+)*@"
            + "[^-][A-Za-z0-9-]+(\\\\.[A-Za-z0-9-]+)*(\\\\.[A-Za-z]{2,})$";

    @Override
    public boolean isValid(String mail, ConstraintValidatorContext validatorContext) {
        return mail != null && mail.matches(EMAIL_REGEX);
    }
}
