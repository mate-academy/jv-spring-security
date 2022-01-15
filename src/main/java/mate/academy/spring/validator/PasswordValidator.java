package mate.academy.spring.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import mate.academy.spring.dto.request.UserRequestDto;

public class PasswordValidator implements
        ConstraintValidator<Password, Object> {

    @Override
    public boolean isValid(Object userRequestDto,
                           ConstraintValidatorContext constraintValidatorContext) {
        UserRequestDto user = (UserRequestDto) userRequestDto;
        return user.getPassword().equals(user.getRepeatPassword());
    }
}
