package mate.academy.spring.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import mate.academy.spring.dto.request.UserRequestDto;

public class RepeatPasswordValidator implements ConstraintValidator<RepeatPassword, Object> {
    @Override
    public boolean isValid(Object object, ConstraintValidatorContext constraintValidatorContext) {
        UserRequestDto dto = (UserRequestDto) object;
        if (dto.getPassword() == null) {
            return false;
        }
        return dto.getPassword().equals(dto.getRepeatPassword());
    }
}
