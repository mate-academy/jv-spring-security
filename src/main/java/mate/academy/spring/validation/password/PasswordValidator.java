package mate.academy.spring.validation.password;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import mate.academy.spring.dto.request.UserRequestDto;

public class PasswordValidator implements ConstraintValidator<Password, UserRequestDto> {
    public static final String PASSWORD_PATTERN = "^(?=.*[0-9])(?=.*[a-z])"
            + "(?=.*[A-Z])(?=\\S+$).{8,}$";

    @Override
    public boolean isValid(UserRequestDto userRequestDto,
                           ConstraintValidatorContext constraintValidatorContext) {
        String password = userRequestDto.getPassword();
        String repeatPassword = userRequestDto.getRepeatPassword();
        if (password == null || repeatPassword == null) {
            return false;
        }
        if (!password.matches(PASSWORD_PATTERN)) {
            constraintValidatorContext.buildConstraintViolationWithTemplate("Password should be "
                            + "8 symbols or longer and contain uppercase, lowercase and number.")
                    .addConstraintViolation();
        }
        if (!password.equals(repeatPassword)) {
            constraintValidatorContext.buildConstraintViolationWithTemplate("Password and "
                            + "repeat password should be the same.")
                    .addConstraintViolation();
        }
        return password.matches(PASSWORD_PATTERN) && password.equals(repeatPassword);
    }
}
