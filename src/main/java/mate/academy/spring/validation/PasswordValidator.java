package mate.academy.spring.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import mate.academy.spring.dto.request.UserRequestDto;

public class PasswordValidator implements ConstraintValidator<Password, UserRequestDto> {
    @Override
    public boolean isValid(UserRequestDto user, ConstraintValidatorContext context) {
        return isPasswordMatched(user);
    }

    public Boolean isPasswordMatched(UserRequestDto userRequestDto) {
        return (userRequestDto.getPassword().equals(userRequestDto.getRepeatPassword()));
    }
}
