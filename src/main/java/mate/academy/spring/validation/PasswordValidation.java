package mate.academy.spring.validation;

import java.util.regex.Pattern;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import mate.academy.spring.dto.request.UserRequestDto;

public class PasswordValidation implements ConstraintValidator<Email, UserRequestDto> {
    private static final Pattern PASSWORD_PATTERN =
            Pattern.compile("^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{8,40}$");

    @Override
    public boolean isValid(UserRequestDto userRequestDto, ConstraintValidatorContext context) {
        if (userRequestDto.getPassword() == null
                || !userRequestDto.getPassword().equals(userRequestDto.getRepeatPassword())) {
            return false;
        }
        return PASSWORD_PATTERN.matcher(userRequestDto.getPassword()).matches();
    }
}

