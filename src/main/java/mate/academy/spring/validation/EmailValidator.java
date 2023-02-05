package mate.academy.spring.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import javax.validation.constraints.Email;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator implements ConstraintValidator<Email, String> {
    private static final String EMAIL_PATTERN =
            "/^((([0-9A-Za-z]{1}[-0-9A-z\\"
            + ".]{1,}[0-9A-Za-z]{1})|([0-9А-Яа-я]{1}[-0-9А-я\\"
            + ".]{1,}[0-9А-Яа-я]{1}))@([-A-Za-z]{1,}\\"
            + ".){1,2}[-A-Za-z]{2,})$/u";

    @Override
    public boolean isValid(String value, ConstraintValidatorContext constraintValidatorContext) {
        if (value == null) {
            return false;
        }
        Pattern pattern = Pattern.compile(value);
        Matcher matcher = pattern.matcher(value);
        return matcher.matches();
    }
}
