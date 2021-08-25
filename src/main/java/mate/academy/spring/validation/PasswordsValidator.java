package mate.academy.spring.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import mate.academy.spring.dto.request.UserRequestDto;

public class PasswordsValidator implements ConstraintValidator<PasswordsMatch, UserRequestDto> {
    @Override
    public boolean isValid(UserRequestDto value,
                           ConstraintValidatorContext constraintValidatorContext) {
        String password = value.getPassword();
        String repeatPassword = value.getRepeatPassword();
        if (password != null) {
            return password.equals(repeatPassword);
        }
        return repeatPassword == null;
    }
}
