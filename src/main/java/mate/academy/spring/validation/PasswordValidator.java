package mate.academy.spring.validation;

import mate.academy.spring.dto.request.UserRequestDto;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PasswordValidator implements ConstraintValidator<ValidPassword, UserRequestDto> {
    @Override
    public boolean isValid(UserRequestDto userRequestDto,
                           ConstraintValidatorContext constraintValidatorContext) {
        if (userRequestDto.getPassword() == null) {
            return false;
        }
        if (userRequestDto.getRepeatPassword() == null) {
            return false;
        }
        if (userRequestDto.getPassword().length() < 4) {
            return false;
        }
        return userRequestDto.getRepeatPassword().equals(userRequestDto.getPassword());
    }
}
