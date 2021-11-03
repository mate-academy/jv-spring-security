package mate.academy.spring.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import mate.academy.spring.dto.request.UserRequestDto;

public class RepeatedPasswordValidator
        implements ConstraintValidator<RepeatedPassword, UserRequestDto> {

    @Override
    public void initialize(RepeatedPassword constraintAnnotation) {
    }

    @Override
    public boolean isValid(UserRequestDto dto,
                           ConstraintValidatorContext constraintValidatorContext) {
        return dto == null || dto.getPassword() == null || dto.getRepeatPassword() == null
                ? false : dto.getPassword().equals(dto.getRepeatPassword());
    }
}
