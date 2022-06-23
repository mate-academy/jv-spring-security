package mate.academy.spring.validator;

import java.util.regex.Pattern;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import javax.validation.constraints.Email;

public class EmailValidator implements ConstraintValidator<Email, String> {
    private static final String EMAIL_PATTERN = "^[a-zA-Z\\d.!#$%&'*+/=?^_{|}~-]"
            + "+@((\\[\\d{1,3}\\.\\d{1,3}.\\[\\d{1,3}."
            + "\\[\\d{1,3}])|(([a-zA-Z\\-\\d]+\\.)+[a-zA-Z]{2,}))$";

    @Override
    public boolean isValid(String email, ConstraintValidatorContext constraintValidatorContext) {
        return email != null && Pattern.compile(EMAIL_PATTERN).matcher(email).matches();
    }
}
