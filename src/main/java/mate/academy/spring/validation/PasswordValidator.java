package mate.academy.spring.validation;

import java.util.Objects;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import mate.academy.spring.dto.request.UserRequestDto;

public class PasswordValidator implements ConstraintValidator<Password, UserRequestDto> {
    @Override
    public boolean isValid(UserRequestDto userRequestDto,
                           ConstraintValidatorContext constraintValidatorContext) {
        if (userRequestDto.getPassword() != null) {
            return userRequestDto.getPassword().length() > 4
                    && Objects.equals(userRequestDto.getPassword(),
                    userRequestDto.getRepeatPassword());
        }
        return false;
    }
}
