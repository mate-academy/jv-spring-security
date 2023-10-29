package mate.academy.spring.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import mate.academy.spring.dto.request.UserRequestDto;

public class PasswordMatchValidator implements ConstraintValidator<PasswordMatch, UserRequestDto> {
    @Override
    public boolean isValid(UserRequestDto userRequestDto,
                           ConstraintValidatorContext constraintValidatorContext) {
        if (isNotNull(userRequestDto)) {
            return userRequestDto.getPassword().equals(userRequestDto.getRepeatPassword());
        }
        return false;
    }

    private boolean isNotNull(UserRequestDto userRequestDto) {
        return userRequestDto != null && userRequestDto.getPassword() != null
                && userRequestDto.getRepeatPassword() != null;
    }
}
