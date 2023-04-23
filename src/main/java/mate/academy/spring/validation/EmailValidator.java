package mate.academy.spring.validation;

import java.util.regex.Pattern;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class EmailValidator implements ConstraintValidator<Email, String> {
    private static final String EMAIL_PATTERN = "^[a-z\\d._%+-]+@[a-z\\d.-]+\\.[a-z]{2,4}$";
    private static final Pattern PATTERN = Pattern.compile(EMAIL_PATTERN);
    @Override
    public boolean isValid(String email, ConstraintValidatorContext context) {
        if (email == null) {
            return false;
        }
        return PATTERN.matcher(email).matches();
    }
}
