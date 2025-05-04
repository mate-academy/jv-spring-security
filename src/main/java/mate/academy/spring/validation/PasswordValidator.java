package mate.academy.spring.validation;

import java.util.regex.Pattern;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PasswordValidator implements ConstraintValidator<Password, String> {
    private static final Pattern validPasswordPattern
            = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?="
            + ".*[@#$%^&-+=()])(?=\\S+$).{8, 20}$");

    @Override
    public boolean isValid(String password, ConstraintValidatorContext context) {
        return password != null && password.matches(validPasswordPattern.pattern());
    }
}
