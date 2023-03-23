package mate.academy.spring.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import mate.academy.spring.dto.request.UserRequestDto;

public class PasswordValidator implements ConstraintValidator<ValidPassword, UserRequestDto> {
    @Override
    public boolean isValid(UserRequestDto userRequestDto,
                           ConstraintValidatorContext constraintValidatorContext) {
        String plainPassword = userRequestDto.getPassword();
        String repeatPassword = userRequestDto.getRepeatPassword();

        if (plainPassword == null || plainPassword == "" || repeatPassword == ""
                || !plainPassword.equals(repeatPassword)) {
            return false;
        }
        return true;
    }
}
