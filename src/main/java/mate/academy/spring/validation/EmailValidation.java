package mate.academy.spring.validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class EmailValidation implements ConstraintValidator<Email, String> {
    private static final String EMAIL_PATTERN = "^(.+)@(.+)$";

    @Override
    public boolean isValid(String email, ConstraintValidatorContext constraintValidatorContext) {
        if (email == null) {
            return false;
        }
        Pattern pattern = Pattern.compile(EMAIL_PATTERT);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}
