package mate.academy.spring.validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class EmailValidator implements ConstraintValidator<Email, String> {
    public static final String EMAIL_PATTERN = "^(.+)@(.+)$";
    public static final Pattern COMPILE_EMAIL_PATTEN = Pattern.compile(EMAIL_PATTERN);

    @Override
    public boolean isValid(String email, ConstraintValidatorContext constraintValidatorContext) {
        if (email == null) {
            return false;
        }
        Matcher matcher = COMPILE_EMAIL_PATTEN.matcher(email);
        return matcher.matches();
    }
}
