package mate.academy.spring.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import mate.academy.spring.dto.request.UserRequestDto;

public class RepeatingPasswordValidator implements
        ConstraintValidator<RepeatingPassword, UserRequestDto> {
    @Override
    public boolean isValid(UserRequestDto value, ConstraintValidatorContext context) {
        return value.getPassword().equals(value.getRepeatPassword());
    }
}
