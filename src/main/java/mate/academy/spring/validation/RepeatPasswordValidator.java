package mate.academy.spring.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import mate.academy.spring.dto.request.UserRequestDto;

public class RepeatPasswordValidator
        implements ConstraintValidator<RepeatPassword, UserRequestDto> {
    @Override
    public boolean isValid(UserRequestDto requestDto,
                           ConstraintValidatorContext constraintValidatorContext) {
        String password = requestDto.getPassword();
        return password != null
                && password.equals(requestDto.getRepeatPassword());
    }
}
