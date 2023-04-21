package mate.academy.spring.validation;

import java.util.regex.Pattern;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class EmailValidator implements ConstraintValidator<Email, String> {
    private static Pattern EMAIL_PATTERN = Pattern.compile(
               "^[a-zA-Z0-9_!#$%&’*+/=?`{|}~^-]+" + "(?:\\.[a-zA-Z0-9_!#$%&’*+/=?`{|}~^-]+)"
                       + "*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$");

    @Override
    public boolean isValid(String email, ConstraintValidatorContext constraintValidatorContext) {
        return email != null
                && EMAIL_PATTERN.matcher(email).matches();
    }
}
