package mate.academy.spring.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import mate.academy.spring.dto.request.UserRequestDto;

public class PasswordsEqual implements ConstraintValidator<Password, Object> {
    @Override
    public boolean isValid(Object candidate,
                           ConstraintValidatorContext constraintValidatorContext) {
        UserRequestDto user = (UserRequestDto) candidate;
        if (user.getPassword() == null || user.getRepeatPassword() == null) {
            return false;
        }
        return user.getPassword().equals(user.getRepeatPassword());
    }
}
