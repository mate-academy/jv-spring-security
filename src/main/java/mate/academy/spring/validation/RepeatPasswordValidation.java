package mate.academy.spring.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import mate.academy.spring.dto.request.UserRequestDto;

public class RepeatPasswordValidation implements ConstraintValidator<RepeatPassword, Object> {

    @Override
    public boolean isValid(Object o, ConstraintValidatorContext constraintValidatorContext) {
        UserRequestDto userRequestDto = (UserRequestDto) o;
        return (userRequestDto.getPassword()).equals(userRequestDto.getRepeatPassword());
    }
}
