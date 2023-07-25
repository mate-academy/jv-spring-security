package mate.academy.spring.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import mate.academy.spring.dto.request.UserRequestDto;

public class PasswordValidator implements ConstraintValidator<Password, UserRequestDto> {
    private final int MIN_PASSWORD_SIZE = 8;

    @Override
    public boolean isValid(UserRequestDto userRequestDto, ConstraintValidatorContext context) {
        return userRequestDto.getPassword() != null
                && userRequestDto.getPassword().length() >= MIN_PASSWORD_SIZE
                && userRequestDto.getPassword().equals(userRequestDto.getRepeatPassword());
    }
}
