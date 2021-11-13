package mate.academy.spring.lib;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import mate.academy.spring.dto.request.UserRequestDto;

public class PasswordsFieldMatchValidator implements
        ConstraintValidator<PasswordFieldsMatch, Object> {

    @Override
    public boolean isValid(Object dto, ConstraintValidatorContext constraintValidatorContext) {
        UserRequestDto userDto = (UserRequestDto) dto;
        return userDto.getPassword().equals(userDto.getRepeatPassword());
    }
}
