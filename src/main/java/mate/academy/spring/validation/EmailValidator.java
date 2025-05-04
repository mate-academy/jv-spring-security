package mate.academy.spring.validation;

import java.util.regex.Pattern;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class EmailValidator implements ConstraintValidator<Email, String> {
    private static final String EMAIL_PATTERN = "^[a-zA-Z0-9._%+-]+@"
            + "[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$\n";
    private static final Pattern PATTERN = Pattern.compile(EMAIL_PATTERN);

    @Override
    public boolean isValid(String email, ConstraintValidatorContext constraintValidatorContext) {
        return email != null && PATTERN.matcher(email).matches();
    }
}
