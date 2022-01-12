package mate.academy.spring.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import mate.academy.spring.dto.request.UserRequestDto;

public class PasswordValidator implements ConstraintValidator<Password, UserRequestDto> {
    private static final String PASSWORD_PATTERN = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])"
                                + "(?=.*[@#$%^&+=])(?=\\S+$).{8,}$";

    @Override
    public boolean isValid(UserRequestDto userRequestDto,
                           ConstraintValidatorContext constraintValidatorContext) {
        String password = userRequestDto.getPassword();
        String repeatPassword = userRequestDto.getRepeatPassword();
        if (password == null || repeatPassword == null) {
            return false;
        }
        if (!password.matches(PASSWORD_PATTERN)) {
            constraintValidatorContext.buildConstraintViolationWithTemplate("Password should "
                    + "be 8 symbols or longer and contains lower and upper case character,"
                    + " special symbol and number").addConstraintViolation();
        }
        if (!password.equals(repeatPassword)) {
            constraintValidatorContext.buildConstraintViolationWithTemplate("Password "
                    + "and repeat password should match").addConstraintViolation();
        }
        return password.matches(PASSWORD_PATTERN) && password.equals(repeatPassword);
    }
}
