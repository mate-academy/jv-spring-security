package mate.academy.spring.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import mate.academy.spring.dto.request.UserRequestDto;

public class PasswordValidator implements ConstraintValidator<Password, UserRequestDto> {
    @Override
    public boolean isValid(UserRequestDto user,
                           ConstraintValidatorContext constraintValidatorContext) {
        if (!user.getPassword().equals(user.getRepeatPassword())) {
            return false;
        }
        return user.getPassword().length() >= 4 && !user.getPassword().isBlank();
    }
}
