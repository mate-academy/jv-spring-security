package mate.academy.spring.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import mate.academy.spring.dto.request.UserRequestDto;

public class PasswordValidator implements ConstraintValidator<ValidPassword, UserRequestDto> {
    @Override
    public boolean isValid(UserRequestDto requestDto, ConstraintValidatorContext context) {
        String password = requestDto.getPassword();
        String repeatPassword = requestDto.getRepeatPassword();
        if (password != null && repeatPassword != null
                             && password.length() >= 6) {
            return password.equals(repeatPassword);
        }
        return false;
    }
}
