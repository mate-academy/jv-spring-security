package mate.academy.spring.model.validation;

import java.util.Objects;
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

        if (password.isBlank() || repeatPassword.isBlank()) {
            return false;
        }

        return Objects.equals(password, repeatPassword);
    }
}
