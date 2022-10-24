package mate.academy.spring.validation;

import java.util.Objects;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import mate.academy.spring.dto.request.UserRequestDto;

public class PasswordValidator implements
        ConstraintValidator<ValidateRepeatPassword, UserRequestDto> {
    @Override
    public boolean isValid(UserRequestDto user,
                           ConstraintValidatorContext constraintValidatorContext) {
        return Objects.equals(user.getPassword(), user.getRepeatPassword())
                && user.getPassword().length() >= 8
                && !user.getPassword().isBlank();
    }
}
