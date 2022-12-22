package mate.academy.spring.validation;

import java.util.regex.Pattern;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class EmailValidator implements ConstraintValidator<Email, String> {
    private static final Pattern PATTERN = Pattern.compile(
            "^[\\w.!#$%&’*+/=?^_`{|}~-]{1,64}@[\\w-]+(?:\\.[\\w-]+)*$");
    private static final int RFC5321_MAX_PATH_LENGTH = 254;

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (value == null || value.isEmpty() || value.length() > RFC5321_MAX_PATH_LENGTH) {
            return false;
        }
        return PATTERN.matcher(value).matches();
    }
}
