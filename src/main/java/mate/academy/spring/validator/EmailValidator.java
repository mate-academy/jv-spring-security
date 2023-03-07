package mate.academy.spring.validator;

import java.util.regex.Pattern;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class EmailValidator implements
        ConstraintValidator<Email, String> {
    private static final Pattern EMAIL_REGEX =
            Pattern.compile("^(?=.{1,64}@)[A-Za-z0-9_-]"
            + "+(\\\\.[A-Za-z0-9_-]+)*@[^-][A-Za-z0-9-]"
            + "+(\\\\.[A-Za-z0-9-]+)*(\\\\.[A-Za-z]{2,})$");

    @Override
    public boolean isValid(String email, ConstraintValidatorContext constraintValidatorContext) {
        return email != null && EMAIL_REGEX.matcher(email).matches();
    }
}
