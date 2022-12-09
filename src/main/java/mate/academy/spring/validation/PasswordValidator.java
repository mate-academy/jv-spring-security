package mate.academy.spring.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PasswordValidator implements ConstraintValidator<Password, String> {
    private static final String PASSWORD_REGEX = "^(?=.*?[0-9]).{4,}$";

    @Override
    public boolean isValid(String password, ConstraintValidatorContext constraintValidatorContext) {
        return password != null && password.matches(PASSWORD_REGEX);
    }
}
