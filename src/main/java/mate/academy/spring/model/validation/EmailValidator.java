package mate.academy.spring.model.validation;

import java.util.regex.Pattern;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class EmailValidator implements ConstraintValidator<Email, String> {
    private static final Pattern EMAIL_PATTERN = Pattern.compile(
            "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}");

    @Override
    public boolean isValid(String email, ConstraintValidatorContext context) {
        return email != null && !email.isBlank() && EMAIL_PATTERN.matcher(email).matches();
    }
}
