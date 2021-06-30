package mate.academy.spring.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import mate.academy.spring.dto.request.UserRequestDto;

public class PasswordMatchValidator implements ConstraintValidator<PasswordMatch, UserRequestDto> {
    @Override
    public boolean isValid(UserRequestDto userRequestDto,
                           ConstraintValidatorContext constraintValidatorContext) {
        if (userRequestDto.getPassword() == null || userRequestDto.getPasswordRepeat() == null
                || userRequestDto.getPassword().length() < 4
                || userRequestDto.getPasswordRepeat().length() < 4) {
            return false;
        }
        return userRequestDto.getPassword().equals(userRequestDto.getPasswordRepeat());
    }
}
