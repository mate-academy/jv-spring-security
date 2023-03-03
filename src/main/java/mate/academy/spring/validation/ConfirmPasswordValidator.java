package mate.academy.spring.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import mate.academy.spring.dto.request.UserRequestDto;

public class ConfirmPasswordValidator
        implements ConstraintValidator<ValidatePassword, UserRequestDto> {
    @Override
    public boolean isValid(UserRequestDto value, ConstraintValidatorContext context) {
        String password = value.getPassword();
        return password != null && password.equals(value.getRepeatPassword());
    }
}
