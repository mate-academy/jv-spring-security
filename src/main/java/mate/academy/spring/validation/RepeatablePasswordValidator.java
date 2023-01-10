package mate.academy.spring.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import mate.academy.spring.dto.request.UserRequestDto;

public class RepeatablePasswordValidator implements
        ConstraintValidator<RepeatablePassword, UserRequestDto> {
    private static final String VALID_PASSWORD_REGEX = "^[a-zA-Z0-9]{6,16}+$";

    @Override
    public boolean isValid(UserRequestDto userRequestDto,
                           ConstraintValidatorContext constraintValidatorContext) {
        String password = userRequestDto.getPassword();
        return password != null
                && password.matches(VALID_PASSWORD_REGEX)
                && password.equals(userRequestDto.getRepeatPassword());
    }
}
