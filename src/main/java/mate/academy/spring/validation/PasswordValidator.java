package mate.academy.spring.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import mate.academy.spring.dto.request.UserRequestDto;

public class PasswordValidator implements ConstraintValidator<Password, UserRequestDto> {
    private static final String PASSWORD_PATTERN = "(?=^.{8,}$)((?=.*\\d)|(?=.*\\W+))"
            + "(?![.\\n])(?=.*[A-Z])(?=.*[a-z]).*$";

    @Override
    public boolean isValid(UserRequestDto user,
                           ConstraintValidatorContext constraintValidatorContext) {
        if (user.getPassword() == null || user.getRepeatPassword() == null) {
            return false;
        }
        return user.getPassword().matches(PASSWORD_PATTERN)
                && user.getRepeatPassword().matches(user.getPassword());
    }
}
