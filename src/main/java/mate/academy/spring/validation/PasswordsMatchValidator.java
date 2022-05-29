package mate.academy.spring.validation;

import java.util.Objects;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import mate.academy.spring.dto.request.UserRequestDto;

public class PasswordsMatchValidator implements ConstraintValidator<PasswordsMatch,
        UserRequestDto> {
    @Override
    public boolean isValid(UserRequestDto dto, ConstraintValidatorContext context) {
        return Objects.equals(dto.getPassword(), dto.getRepeatPassword());
    }
}
