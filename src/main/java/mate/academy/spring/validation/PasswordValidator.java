package mate.academy.spring.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import mate.academy.spring.dto.request.UserRequestDto;

public class PasswordValidator implements ConstraintValidator<Password, UserRequestDto> {
    private static final int MIN_PASSWORD_LENGTH = 4;

    @Override
    public boolean isValid(UserRequestDto userRequestDto,
                           ConstraintValidatorContext constraintValidatorContext) {
        return userRequestDto != null
                && userRequestDto.getPassword() != null
                && userRequestDto.getPassword().length() >= MIN_PASSWORD_LENGTH
                && userRequestDto.getPassword().equals(userRequestDto.getRepeatPassword());
    }
}
