package mate.academy.spring.validation;

import java.util.regex.Pattern;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PasswordValidator implements ConstraintValidator<Password, String> {
    private final Pattern validPasswordPattern
            = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?="
            + ".*[@#$%^&-+=()])(?=\\S+$).{8, 20}$");

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return value != null && value.matches(validPasswordPattern.pattern());
    }
}
