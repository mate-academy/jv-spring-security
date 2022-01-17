package mate.academy.spring.validation.impl;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import mate.academy.spring.dto.request.UserRequestDto;
import mate.academy.spring.validation.Password;

public class PasswordValidator implements ConstraintValidator<Password, UserRequestDto> {
    private static final String PASSWORD_PATTERN
            = "^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{8,}$";
    @Override
    public boolean isValid(UserRequestDto value, ConstraintValidatorContext context) {
        String password = value.getPassword();
        String repeatPassword = value.getRepeatPassword();
        if (password == null || repeatPassword == null) {
            return false;
        }
        if (!password.matches(PASSWORD_PATTERN)) {
            context.buildConstraintViolationWithTemplate("Password should be: "
                    + "minimum 8 character and contains at least one number and one letter")
                    .addConstraintViolation();
            return false;
        }
        if (!password.equals(repeatPassword)) {
            context.buildConstraintViolationWithTemplate("Password and repeat password"
                    + "must be the same").addConstraintViolation();
            return false;
        }
        return true;
    }
}
