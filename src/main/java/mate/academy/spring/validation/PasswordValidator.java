package mate.academy.spring.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import mate.academy.spring.dto.request.UserRequestDto;

public class PasswordValidator implements ConstraintValidator<Password, UserRequestDto> {
    @Override
    public boolean isValid(UserRequestDto requestDto,
                           ConstraintValidatorContext constraintValidatorContext) {
        return requestDto.getPassword().equals(requestDto.getRepeatPassword());
    }
}
