package mate.academy.spring.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import mate.academy.spring.dto.request.UserRequestDto;

public class PasswordValidator implements ConstraintValidator<ValidPassword, UserRequestDto> {
    private static final int MIN_LENGTH = 8;

    @Override
    public boolean isValid(UserRequestDto requestDto, ConstraintValidatorContext context) {
        String password = requestDto.getPassword();
        String repeatPassword = requestDto.getRepeatPassword();
        if (password != null && repeatPassword != null
                && password.length() >= MIN_LENGTH) {
            return password.equals(repeatPassword);
        }
        return false;
    }
}
