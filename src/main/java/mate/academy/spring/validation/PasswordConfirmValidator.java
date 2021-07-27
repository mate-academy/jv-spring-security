package mate.academy.spring.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import mate.academy.spring.dto.request.UserRequestDto;

public class PasswordConfirmValidator implements ConstraintValidator<PasswordConfirm, Object> {

    @Override
    public boolean isValid(Object object, ConstraintValidatorContext constraintValidatorContext) {
        UserRequestDto user = (UserRequestDto) object;
        return user.getPassword().equals(user.getRepeatPassword());
    }
}
