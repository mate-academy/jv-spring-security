package mate.academy.spring.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import mate.academy.spring.dto.request.UserRequestDto;

public class PasswordValidator implements ConstraintValidator<ValidPassword, UserRequestDto> {
    @Override
    public boolean isValid(UserRequestDto userDto, ConstraintValidatorContext context) {
        return userDto.getPassword() != null &&
                userDto.getPassword().equals(userDto.getRepeatPassword());
    }
}
