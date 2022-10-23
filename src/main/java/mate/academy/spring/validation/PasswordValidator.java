package mate.academy.spring.validation;

import java.util.Objects;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import mate.academy.spring.dto.request.UserRequestDto;

public class PasswordValidator implements ConstraintValidator<Password, UserRequestDto> {
    private static final int MIN_PASSWORD_LENGTH = 6;

    @Override
    public boolean isValid(UserRequestDto user,
                           ConstraintValidatorContext constraintValidatorContext) {
        if (user.getPassword() == null || user.getRepeatPassword() == null) {
            return false;
        }
        return Objects.equals(user.getPassword(), user.getRepeatPassword())
                && user.getPassword().length() >= MIN_PASSWORD_LENGTH;
    }
}
