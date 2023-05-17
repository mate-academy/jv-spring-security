package mate.academy.spring.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import mate.academy.spring.dto.request.UserRequestDto;
import mate.academy.spring.validation.annotation.ValidPassword;

public class MatchPasswordValidator implements ConstraintValidator<ValidPassword,
        UserRequestDto> {
    @Override
    public boolean isValid(UserRequestDto userRequestDto,
                           ConstraintValidatorContext constraintValidatorContext) {
        return userRequestDto != null && userRequestDto
                .getPassword()
                .equals(userRequestDto.getRepeatPassword());
    }
}
