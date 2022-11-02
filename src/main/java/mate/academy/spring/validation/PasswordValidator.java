package mate.academy.spring.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import mate.academy.spring.dto.request.UserRequestDto;

public class PasswordValidator implements ConstraintValidator<Password, UserRequestDto> {
    private static final int PASSWORD_MIN_LENGTH = 6;

    @Override
    public boolean isValid(UserRequestDto userRequestDto,
                           ConstraintValidatorContext constraintValidatorContext) {
        String password = userRequestDto.getPassword();
        String repeatPassword = userRequestDto.getRepeatPassword();
        if (password != null && password.equals(repeatPassword)
                && password.length() >= PASSWORD_MIN_LENGTH) {
            return true;
        }
        return false;
    }
}
