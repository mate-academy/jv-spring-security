package mate.academy.spring.validation;

import mate.academy.spring.dto.request.UserRequestDto;

import javax.validation.Constraint;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Objects;

public class PasswordValidator implements ConstraintValidator<Password, UserRequestDto> {
    @Override
    public boolean isValid(UserRequestDto user,
                           ConstraintValidatorContext constraintValidatorContext) {
        return Objects.equals(user.getPassword(), user.getRepeatPassword())
                && user.getPassword().length() >= 8
                && !user.getPassword().isBlank();
    }
}
