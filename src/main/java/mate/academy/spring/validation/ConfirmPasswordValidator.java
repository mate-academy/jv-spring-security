package mate.academy.spring.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import mate.academy.spring.dto.request.UserRequestDto;

public class ConfirmPasswordValidator
        implements ConstraintValidator<ValidatePassword, UserRequestDto> {
    @Override
    public boolean isValid(UserRequestDto validatePassword, ConstraintValidatorContext context) {
        String password = validatePassword.getPassword();
        return password != null && password.equals(validatePassword.getRepeatPassword());
    }
}
