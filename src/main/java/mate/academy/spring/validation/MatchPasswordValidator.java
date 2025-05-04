package mate.academy.spring.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import mate.academy.spring.dto.request.UserRequestDto;

public class MatchPasswordValidator implements ConstraintValidator<MatchPassword, UserRequestDto> {
    @Override
    public boolean isValid(UserRequestDto value, ConstraintValidatorContext context) {
        if (value.getPassword() == null || value.getRepeatPassword() == null) {
            return false;
        }
        return value.getPassword().equals(value.getRepeatPassword());
    }
}
