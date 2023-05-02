package mate.academy.spring.validation.password;

import java.util.regex.Pattern;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PasswordValidator implements ConstraintValidator<Password, String> {
    private static final Pattern PATTERN = Pattern.compile("^\\+380\\d{9}$");

    @Override
    public boolean isValid(String password, ConstraintValidatorContext constraintValidatorContext) {
        return password != null && PATTERN.matcher(password).matches();
    }
}
