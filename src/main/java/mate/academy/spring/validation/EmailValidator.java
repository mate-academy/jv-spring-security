package mate.academy.spring.validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class EmailValidator implements ConstraintValidator<ValidEmail,String> {
    private static final String EMAIL_PATTERN = "[a-z0-9._%+-]+@[a-z0-9.-]+[a-z]{2,4}$";
    private static final Pattern PATTERN = Pattern.compile(EMAIL_PATTERN);

    @Override
    public boolean isValid(String email, ConstraintValidatorContext constraintValidatorContext) {
        if (email == null) {
            return false;
        }
        Matcher matcher = PATTERN.matcher(email);
        return matcher.matches();
    }
}
