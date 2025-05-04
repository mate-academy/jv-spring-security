package mate.academy.spring.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import mate.academy.spring.dto.request.UserRequestDto;

public class ValidPasswordValidator implements ConstraintValidator<ValidPassword, UserRequestDto> {
    private static final String PASSWORD_PATTERN = "(?=.*[0-9])"
            + "(?=.*[!@#$%^&*])"
            + "(?=.*[a-z])(?=.*[A-Z])"
            + "[0-9a-zA-Z!@#$%^&*]{8,}";

    @Override
    public boolean isValid(UserRequestDto userRequestDto,
                           ConstraintValidatorContext constraintValidatorContext) {
        String password = userRequestDto.getPassword();
        return password != null && password.matches(PASSWORD_PATTERN)
                && password.equals(userRequestDto.getRepeatedPassword());
    }
}
