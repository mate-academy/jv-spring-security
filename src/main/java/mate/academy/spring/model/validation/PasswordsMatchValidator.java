package mate.academy.spring.model.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import mate.academy.spring.dto.request.UserRequestDto;

public class PasswordsMatchValidator implements
        ConstraintValidator<PasswordsMatch, UserRequestDto> {
    @Override
    public boolean isValid(UserRequestDto dto, ConstraintValidatorContext context) {
        if (dto == null) {
            return false;
        }

        String password = dto.getPassword();
        String repeatPassword = dto.getRepeatPassword();

        if (password == null || password.isBlank()) {
            return false;
        }

        return password.equals(repeatPassword);
    }
}
