package mate.academy.spring.validation;

import mate.academy.spring.dto.request.UserRequestDto;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PasswordEqualsValidator implements ConstraintValidator<PasswordEquals, UserRequestDto> {
    @Override
    public boolean isValid(UserRequestDto userRequestDto,
                           ConstraintValidatorContext constraintValidatorContext) {
        return userRequestDto.getPassword().equals(userRequestDto.getRepeatedPassword());
    }
}
