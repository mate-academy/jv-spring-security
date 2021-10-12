package mate.academy.spring.lib;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import mate.academy.spring.dto.request.UserRequestDto;

public class PasswordMatcher implements ConstraintValidator<PasswordMatch, UserRequestDto> {
    @Override
    public boolean isValid(UserRequestDto userRequestDto,
                           ConstraintValidatorContext constraintValidatorContext) {
        return userRequestDto != null
                && userRequestDto.getPassword().equals(userRequestDto.getRepeatPassword());
    }
}
