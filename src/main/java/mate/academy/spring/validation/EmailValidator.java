package mate.academy.spring.validation;

import java.util.regex.Pattern;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class EmailValidator implements ConstraintValidator<Email, String> {
    private static final Pattern EMAIL_PATTERN = Pattern.compile("^([\\w-\\.]+){1,64}@"
            + "([\\w&&[^_]]+){2,255}.[a-z]{2,}$", Pattern.CASE_INSENSITIVE);

    @Override
    public boolean isValid(String email, ConstraintValidatorContext constraintValidatorContext) {
        return email != null && EMAIL_PATTERN.matcher(email).matches();
    }
}
