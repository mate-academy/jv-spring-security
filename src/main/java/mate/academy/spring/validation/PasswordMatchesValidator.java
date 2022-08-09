package mate.academy.spring.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import mate.academy.spring.dto.request.UserRequestDto;

public class PasswordMatchesValidator
        implements ConstraintValidator<PasswordMatches, UserRequestDto> {

    @Override
    public boolean isValid(UserRequestDto dto,
                           ConstraintValidatorContext constraintValidatorContext) {
        return dto.getPassword().equals(dto.getRepeatPassword());
    }
}
