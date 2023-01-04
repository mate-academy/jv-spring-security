package mate.academy.spring.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import mate.academy.spring.dto.request.UserRequestDto;

public class PasswordValidator implements ConstraintValidator<ValidPassword, Object> {
    @Override
    public boolean isValid(Object user, ConstraintValidatorContext constraintValidatorContext) {
        UserRequestDto userRequestDto = (UserRequestDto) user;
        if (userRequestDto.getPassword() == null
                || userRequestDto.getRepeatPassword() == null) {
            return false;
        }
        return userRequestDto.getPassword().equals(userRequestDto.getRepeatPassword());
    }
}
