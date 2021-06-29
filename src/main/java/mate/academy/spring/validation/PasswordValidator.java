package mate.academy.spring.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import mate.academy.spring.dto.request.UserRequestDto;

public class PasswordValidator implements ConstraintValidator<Password, UserRequestDto> {
    private static final String PASSWORD_PATTERN = "^(?=.*[a-z])(?=.*[A-Z])"
            + "(?=.*\\d)[a-zA-Z\\d]{8,}$";

    @Override
    public boolean isValid(UserRequestDto userRequestDto,
                           ConstraintValidatorContext constraintValidatorContext) {
        return passwordsNotNull(userRequestDto)
                && passwordsEquals(userRequestDto)
                && passwordMatchesExpression(userRequestDto);
    }

    private boolean passwordsNotNull(UserRequestDto userRequestDto) {
        return userRequestDto.getPassword() != null && userRequestDto.getRepeatPassword() != null;
    }

    private boolean passwordsEquals(UserRequestDto userRequestDto) {
        return userRequestDto.getPassword().equals(userRequestDto.getRepeatPassword());
    }

    private boolean passwordMatchesExpression(UserRequestDto userRequestDto) {
        return userRequestDto.getPassword().matches(PASSWORD_PATTERN);
    }
}
