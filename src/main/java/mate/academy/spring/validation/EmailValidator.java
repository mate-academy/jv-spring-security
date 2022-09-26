package mate.academy.spring.validation;

import java.util.regex.Pattern;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class EmailValidator implements ConstraintValidator<Email,String> {
    private static final Pattern EMAIL_PATTERN = Pattern.compile("^[a-zA-Z0-9"
            + ".!#$%&'*+/=?^_`{|}~-]+@("
            + "(\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}])|(([a-zA-Z\\-0-9]+\\.)"
            + "+[a-zA-Z]{2,}))$");

    @Override
    public boolean isValid(final String email, final ConstraintValidatorContext context) {
        return !(email == null || email.isEmpty()) && EMAIL_PATTERN.matcher(email).matches();
    }
}
