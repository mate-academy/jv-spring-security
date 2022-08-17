package mate.academy.spring.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import mate.academy.spring.dto.request.UserRequestDto;

public class RepeatPasswordValidator
        implements ConstraintValidator<RepeatPassword, UserRequestDto> {
    @Override
    public boolean isValid(UserRequestDto user, ConstraintValidatorContext context) {
        if (user.getPassword() != null && user.getRepeatPassword() != null) {
            return user.getPassword().equals(user.getRepeatPassword());
        }
        return false;
    }
}
