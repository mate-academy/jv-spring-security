package mate.academy.spring.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import mate.academy.spring.dto.request.UserRequestDto;

public class PasswordValidator implements ConstraintValidator<Password, UserRequestDto> {
    private static final int MIN_LENGTH = 8;
    private static final int MAX_LENGTH = 100;

    @Override
    public boolean isValid(UserRequestDto userRequestDto,
                           ConstraintValidatorContext constraintValidatorContext) {
        String checkPassword = userRequestDto.getPassword();
        return checkPassword != null
                && checkPassword.equals(userRequestDto.getRepeatPassword());
    }
}
