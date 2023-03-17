package mate.academy.spring.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import mate.academy.spring.dto.request.UserRequestDto;

public class PasswordValidator implements ConstraintValidator<Password, UserRequestDto> {
    @Override
    public boolean isValid(UserRequestDto userRequestDto, ConstraintValidatorContext validator) {
        if (!userRequestDto.getPassword().equals(userRequestDto.getRepeatPassword())
                || userRequestDto.getPassword().isEmpty()
                || userRequestDto.getPassword().length() < 4) {
            return false;
        }
        return true;
    }
}
