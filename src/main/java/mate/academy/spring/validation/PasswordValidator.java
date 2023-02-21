package mate.academy.spring.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import mate.academy.spring.validation.annotation.Password;

public class PasswordValidator implements ConstraintValidator<Password, String> {
    private static final String PASSWORD_PATTERN = "^(?=.*[0-9])(?=.*[A-Z]).{8,20}$";

    @Override
    public boolean isValid(String password,
                           ConstraintValidatorContext constraintValidatorContext) {
        return password != null && password.matches(PASSWORD_PATTERN);
    }
}
