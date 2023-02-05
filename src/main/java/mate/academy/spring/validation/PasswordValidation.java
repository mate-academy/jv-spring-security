package mate.academy.spring.validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PasswordValidation implements ConstraintValidator<Password, String> {
    private static final String PASSWORD_PATTERN = "^[a-zA-Z0-9]\\w{3,14}$";

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (value == null) {
            return false;
        }
        Pattern pattern = Pattern.compile(value);
        Matcher matcher = pattern.matcher(value);
        return matcher.matches();
    }
}
