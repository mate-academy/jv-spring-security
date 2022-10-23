package mate.academy.spring.security;

import java.util.Objects;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import mate.academy.spring.dto.request.UserRequestDto;

public class PasswordValidator implements ConstraintValidator<Password, UserRequestDto> {
    @Override
    public boolean isValid(UserRequestDto user,
                           ConstraintValidatorContext constraintValidatorContext) {
        return Objects.equals(user.getPassword(), user.getRepeatPassword())
                && user.getPassword().length() >= 4 && !user.getPassword().isBlank();
    }
}
