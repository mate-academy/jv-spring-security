package mate.academy.spring.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation implements ConstraintValidator<Email, String > {
    private static final String EMAIL_PATTERT = "^(.+)@(.+)$";

    @Override
    public boolean isValid(String email, ConstraintValidatorContext constraintValidatorContext) {
        if(email == null) {
            return false;
        }
        Pattern pattern = Pattern.compile(EMAIL_PATTERT);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}
