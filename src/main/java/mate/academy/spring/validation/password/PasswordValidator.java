package mate.academy.spring.validation.password;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import mate.academy.spring.dto.request.UserRequestDto;

public class PasswordValidator implements ConstraintValidator<ValidPassword, UserRequestDto> {
    @Override
    public boolean isValid(UserRequestDto userRequestDto,
                           ConstraintValidatorContext context) {
        if (userRequestDto.getPassword() == null
                || userRequestDto.getRepeatPassword() == null
                || (userRequestDto.getPassword().length() < 8
                || userRequestDto.getPassword().length() > 16)
                || (userRequestDto.getRepeatPassword().length() < 8
                || userRequestDto.getRepeatPassword().length() > 16)) {
            return false;
        }
        return userRequestDto.getPassword().equals(userRequestDto.getRepeatPassword());
    }
}
