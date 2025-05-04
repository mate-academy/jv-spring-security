package mate.academy.spring.validation;

import java.util.Objects;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import mate.academy.spring.dto.request.UserRequestDto;

public class PasswordValidator implements ConstraintValidator<Password, UserRequestDto> {
    @Override
    public boolean isValid(UserRequestDto value,
                           ConstraintValidatorContext constraintValidatorContext) {
        return Objects.equals(value.getPassword(), value.getRepeatPassword());
    }
}
