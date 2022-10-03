package mate.academy.spring.validation;

import java.util.Objects;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import mate.academy.spring.dto.request.UserRequestDto;

public class RepeatPasswordValidator implements ConstraintValidator
        <RepeatPassword, UserRequestDto> {
    @Override
    public boolean isValid(UserRequestDto userRequestDto, ConstraintValidatorContext
            constraintValidatorContext) {
        return Objects.equals(userRequestDto.getPassword(), userRequestDto.getRepeatPassword());
    }
}
