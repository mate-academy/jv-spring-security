package mate.academy.spring.validation;

import java.util.regex.Pattern;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class EmailValidator implements ConstraintValidator<Email, String> {
    private static final Pattern EMAIL_PATTERN = Pattern.compile(
            "^[\\w-]+(?:\\.[\\w-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$");

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        return s != null && EMAIL_PATTERN.matcher(s).matches();
    }
}
