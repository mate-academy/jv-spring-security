package mate.academy.spring.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import mate.academy.spring.dto.request.UserRequestDto;

public class PasswordValidator implements ConstraintValidator<Password, Object> {
    @Override
    public boolean isValid(Object value, ConstraintValidatorContext context) {
        if (value instanceof UserRequestDto) {
            UserRequestDto user = (UserRequestDto) value;
            return user.getPassword() != null
                    && user.getPassword().length() > 3
                    && user.getPassword().equals(user.getRepeatPassword());
        }
        return false;
    }
}

