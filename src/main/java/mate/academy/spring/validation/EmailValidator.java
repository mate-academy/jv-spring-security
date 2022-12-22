package mate.academy.spring.validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class EmailValidator implements ConstraintValidator<Email, String> {
    private static final String VALID_EMAIL_REGEX =
            "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";

    @Override
    public boolean isValid(String email,
                           ConstraintValidatorContext constraintValidatorContext) {
        if (email != null) {
            Pattern emailPattern = Pattern.compile(VALID_EMAIL_REGEX);
            Matcher matcher = emailPattern.matcher(email);
            return matcher.matches();
        }
        return false;
    }
}
