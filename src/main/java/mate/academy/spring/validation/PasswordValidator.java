package mate.academy.spring.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import mate.academy.spring.dto.request.UserRequestDto;

public class PasswordValidator implements ConstraintValidator<ConfirmPassword, UserRequestDto> {
    @Override
    public boolean isValid(UserRequestDto user, ConstraintValidatorContext context) {
        return isPasswordMatched(user);
    }

    public Boolean isPasswordMatched(UserRequestDto userRequestDto) {
        return (userRequestDto.getPassword() != null
                && userRequestDto.getRepeatPassword() != null
                && userRequestDto.getPassword().equals(userRequestDto.getRepeatPassword()));
    }
}
