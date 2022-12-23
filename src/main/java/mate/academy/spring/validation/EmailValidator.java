package mate.academy.spring.validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import mate.academy.spring.validation.lib.Email;

public class EmailValidator implements ConstraintValidator<Email,String> {

    private static final Pattern EMAIL_PATTERN = Pattern
            .compile("[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,4}$");

    @Override
    public boolean isValid(String email, ConstraintValidatorContext constraintValidatorContext) {
        if (email == null) {
            return false;
        }
        Matcher matcher = EMAIL_PATTERN.matcher(email);
        return matcher.matches();
    }
}
