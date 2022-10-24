package mate.academy.spring.validation.validator;

import java.util.regex.Pattern;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import mate.academy.spring.validation.Email;

public class EmailValidator implements ConstraintValidator<Email, String> {
    private static final String PATTERN_EMAIL = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
            + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

    @Override
    public boolean isValid(String email, ConstraintValidatorContext context) {
        return (email != null && !email.isEmpty())
                && Pattern.compile(PATTERN_EMAIL).matcher(email).matches();
    }
}
