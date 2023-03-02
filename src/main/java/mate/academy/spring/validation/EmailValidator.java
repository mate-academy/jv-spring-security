package mate.academy.spring.validation;

import java.util.regex.Pattern;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import mate.academy.spring.validation.annotation.Email;

public class EmailValidator implements ConstraintValidator<Email, String> {
    private static final Pattern EMAIL_PATTERN = Pattern
            .compile("^[^@\\s]+@[^@\\s]+\\.[^@\\s]{2,}$\n");

    @Override
    public boolean isValid(String email,
                           ConstraintValidatorContext constraintValidatorContext) {
        return !email.isEmpty() && EMAIL_PATTERN.matcher(email).matches();
    }
}
