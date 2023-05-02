package mate.academy.spring.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import mate.academy.spring.dto.request.UserRequestDto;

public class PasswordValidator implements ConstraintValidator<Password, UserRequestDto> {
    @Override
    public boolean isValid(UserRequestDto userRequestDto,
                           ConstraintValidatorContext constraintValidatorContext) {
        String password = userRequestDto.getPassword();
        return password != null
                && password.length() >= 4
                && password.length() <= 32
                && password.equals(userRequestDto.getRepeatPassword());
    }
}
