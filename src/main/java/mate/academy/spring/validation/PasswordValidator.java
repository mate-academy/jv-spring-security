package mate.academy.spring.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import mate.academy.spring.dto.request.UserRequestDto;

public class PasswordValidator implements ConstraintValidator<Password, UserRequestDto> {
    @Override
    public boolean isValid(UserRequestDto user, ConstraintValidatorContext
            constraintValidatorContext) {
        return user.getPassword() != null && user.getPassword().equals(user.getRepeatPassword());
    }
}
