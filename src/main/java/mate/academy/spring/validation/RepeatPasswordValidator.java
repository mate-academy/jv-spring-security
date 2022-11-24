package mate.academy.spring.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import mate.academy.spring.dto.request.UserRequestDto;

public class RepeatPasswordValidator implements
        ConstraintValidator<RepeatPassword, UserRequestDto> {
    @Override
    public boolean isValid(UserRequestDto userRequestDto,
                           ConstraintValidatorContext constraintValidatorContext) {
        if (userRequestDto.getRepeatPassword() != null
                && userRequestDto.getRepeatPassword().equals(userRequestDto.getPassword())) {
            return true;
        }
        return false;
    }
}
