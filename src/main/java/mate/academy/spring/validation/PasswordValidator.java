package mate.academy.spring.validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PasswordValidator implements ConstraintValidator<ValidPassword, String> {
    private static final String PASSWORD_REGEX_PATTERN =
             "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])"
                    + "(?=.*[!@#$%^&*])[a-zA-Z0-9!@#$%^&*](?=\\S+$).{8,15}$";

    @Override
    public boolean isValid(String password, ConstraintValidatorContext constraintValidatorContext) {
        if (password == null) {
            return false;
        }
        Pattern pattern = Pattern.compile(PASSWORD_REGEX_PATTERN);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }
}
