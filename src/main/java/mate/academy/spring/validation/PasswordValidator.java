package mate.academy.spring.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import mate.academy.spring.dto.request.UserRequestDto;

public class PasswordValidator implements ConstraintValidator<PasswordValidation, UserRequestDto> {

    @Override
    public boolean isValid(UserRequestDto requestDto, ConstraintValidatorContext context) {
        if (requestDto.getPassword() == null || requestDto.getRepeatPassword() == null) {
            return false;
        }
        return requestDto.getPassword().equals(requestDto.getRepeatPassword());
    }
}
