package mate.academy.spring.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PasswordValidator implements ConstraintValidator<Password, String> {

    public static final String VALID_PASSWORD
            = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()])(?=\\S+$).{8, 20}$";

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return value != null && value.matches(VALID_PASSWORD);
    }
}
