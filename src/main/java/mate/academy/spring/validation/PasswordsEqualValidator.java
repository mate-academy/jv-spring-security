package mate.academy.spring.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import mate.academy.spring.dto.request.UserRequestDto;

public class PasswordsEqualValidator
        implements ConstraintValidator<PasswordsEqual, UserRequestDto> {

    @Override
    public boolean isValid(UserRequestDto user,
                           ConstraintValidatorContext constraintValidatorContext) {
        return user != null && user.getPassword().equals(user.getRepeatPassword());
    }
}
