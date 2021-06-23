package mate.academy.spring.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import mate.academy.spring.dto.request.UserRequestDto;

public class PasswordValidator implements ConstraintValidator<ValidPassword, UserRequestDto> {
    private static final int PASSWORD_MIN_LENGTH = 6;

    @Override
    public boolean isValid(UserRequestDto userRequestDto,
                           ConstraintValidatorContext constraintValidatorContext) {
        String password = userRequestDto.getPassword();
        String confirmedPassword = userRequestDto.getConfirmedPassword();
        return password != null && password.equals(confirmedPassword)
                && password.length() >= PASSWORD_MIN_LENGTH;
    }
}
