package mate.academy.spring.security;

import java.util.Objects;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import mate.academy.spring.dto.request.UserRequestDto;

public class PasswordValidator implements ConstraintValidator<Password, UserRequestDto> {
    private static final int MIN_USER_PASSWORD_LENGTH = 4;
    @Override
    public boolean isValid(UserRequestDto user,
                           ConstraintValidatorContext constraintValidatorContext) {
        return !user.getPassword().isBlank()
                && user.getPassword().length() >= MIN_USER_PASSWORD_LENGTH
                && Objects.equals(user.getPassword(), user.getRepeatPassword());
    }
}
