package mate.academy.spring.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import mate.academy.spring.dto.request.UserRequestDto;

public class PasswordsMatchValidator implements ConstraintValidator<PasswordsMatch, Object> {
    @Override
    public boolean isValid(Object value, ConstraintValidatorContext constraintValidatorContext) {
        if (value instanceof UserRequestDto) {
            UserRequestDto dto = (UserRequestDto) value;
            return dto.getPassword().equals(dto.getRepeatPassword());
        }
        return false;
    }
}
