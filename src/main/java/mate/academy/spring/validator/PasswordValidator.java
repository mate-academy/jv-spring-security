package mate.academy.spring.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import mate.academy.spring.dto.request.UserRegistrationDto;

public class PasswordValidator implements ConstraintValidator<ValidPassword,
        UserRegistrationDto> {
    @Override
    public boolean isValid(UserRegistrationDto dto, ConstraintValidatorContext context) {
        String password = dto.getPassword();
        String repeatPassword = dto.getRepeatPassword();
        if (password == null || repeatPassword == null
                || password.length() < 8 || repeatPassword.length() < 8) {
            return false;
        }
        return password.equals(repeatPassword);
    }
}
