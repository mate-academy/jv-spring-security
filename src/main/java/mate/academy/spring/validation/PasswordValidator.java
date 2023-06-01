package mate.academy.spring.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import mate.academy.spring.dto.request.UserRequestDto;

public class PasswordValidator implements ConstraintValidator<PasswordMatching, UserRequestDto> {
    private static final Integer MIN_PASSWORD_LENGTH = 6;

    @Override
    public boolean isValid(UserRequestDto userRequestDto,
                           ConstraintValidatorContext constraintValidatorContext) {
        return userRequestDto != null
                && userRequestDto.getPassword() != null
                && userRequestDto.getPassword().length() >= MIN_PASSWORD_LENGTH
                && userRequestDto.getPassword().equals(userRequestDto.getRepeatPassword());
    }
}
