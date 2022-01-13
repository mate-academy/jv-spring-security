package mate.academy.spring.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import mate.academy.spring.dto.request.UserRequestDto;

public class PasswordConstraintValidator implements
        ConstraintValidator<ValidPassword, UserRequestDto> {
    private static final String PASSWORD_PATTERN =
            "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!-/:-@\\[-`{-~]).{8,32}$";

    @Override
    public boolean isValid(UserRequestDto dto, ConstraintValidatorContext context) {
        String password = dto.getPassword();
        String repeatPassword = dto.getRepeatPassword();

        if (password == null) {
            context.buildConstraintViolationWithTemplate("Password can't be null")
                    .addConstraintViolation();
            return false;
        }
        if (!password.matches(PASSWORD_PATTERN)) {
            context.buildConstraintViolationWithTemplate("Password must contain:\n"
                    + "a minimum of 1 numeric character (0-9) and\n"
                    + "a minimum of 1 upper case letter (A-Z) and\n"
                    + "a minimum of 1 lower case letter (a-z) and\n"
                    + "a minimum of 1 special character: ~`!@#$%^&*()-_+={}[]|\\;:\"<>,./?\n"
                    + "password is 8-32 characters with no space").addConstraintViolation();
            return false;
        }
        if (!password.equals(repeatPassword)) {
            context.buildConstraintViolationWithTemplate(
                    "Password and repeat password should match").addConstraintViolation();
            return false;
        }
        return true;
    }
}
