package mate.academy.spring.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import mate.academy.spring.dto.request.UserRequestDto;

public class SameValidator implements ConstraintValidator<Same, UserRequestDto> {
    @Override
    public boolean isValid(UserRequestDto userRequestDto,
                           ConstraintValidatorContext constraintValidatorContext) {
        if (userRequestDto.getPassword() == null) {
            return false;
        }
        return userRequestDto.getPassword().equals(userRequestDto.getRepeatPassword());
    }
}
