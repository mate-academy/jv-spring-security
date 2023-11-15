package mate.academy.spring.validator;

import java.util.regex.Pattern;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import mate.academy.spring.validator.annotation.Email;

public class EmailValidator implements ConstraintValidator<Email, String> {
    private static final String EMAIL_PATTERN =
            "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
    private static final Pattern pattern = Pattern.compile(EMAIL_PATTERN);

    @Override
    public boolean isValid(String email, ConstraintValidatorContext constraintValidatorContext) {
        return email != null && pattern.matcher(email).matches();
    }
}
