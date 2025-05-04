package mate.academy.spring.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import mate.academy.spring.dto.request.UserRegistrationDto;

public class PasswordValidator implements ConstraintValidator<ValidPassword,
        UserRegistrationDto> {
    private static final int MIN_LENGTH_OF_PASSWORD = 8;

    @Override
    public boolean isValid(UserRegistrationDto dto, ConstraintValidatorContext context) {
        String password = dto.getPassword();
        String repeatPassword = dto.getRepeatPassword();
        if (password == null || repeatPassword == null
                || password.length() < MIN_LENGTH_OF_PASSWORD) {
            return false;
        }
        return password.equals(repeatPassword);
    }
}
