package mate.academy.spring.validator;

import mate.academy.spring.dto.request.UserRegistrationDto;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PasswordValidator implements ConstraintValidator<RepeatPassword, UserRegistrationDto> {
    @Override
    public boolean isValid(UserRegistrationDto dto, ConstraintValidatorContext context) {
        String password = dto.getPassword();
        String repeatPassword = dto.getRepeatPassword();
        if (password == null || repeatPassword == null) {
            return false;
        }
        return password.equals(repeatPassword);
    }
}
