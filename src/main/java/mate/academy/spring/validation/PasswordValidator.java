package mate.academy.spring.validation;

import java.util.Objects;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import mate.academy.spring.dto.request.UserRequestDto;

public class PasswordValidator implements ConstraintValidator<ValidPassword, UserRequestDto> {
    @Override
    public boolean isValid(UserRequestDto userRequestDto,
                           ConstraintValidatorContext constraintValidatorContext) {
        if (userRequestDto.getRepeatPassword() == null
                && userRequestDto.getPassword() == null) {
            return false;
        }
        return Objects.equals(userRequestDto.getPassword(), userRequestDto.getRepeatPassword());
    }

}
