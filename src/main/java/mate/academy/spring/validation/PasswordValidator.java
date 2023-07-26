package mate.academy.spring.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.regex.Pattern;
import mate.academy.spring.dto.request.UserRequestDto;

public class PasswordValidator implements ConstraintValidator<Password, UserRequestDto> {
    private static final Pattern PASSWORD_PATTERN = Pattern.compile("^(?=.*[A-Za-z])(?=.*\\d)(?=.*[@$!%*#?&])[A-Za-z\\d@$!%*#?&]{8,}$");

    @Override
    public boolean isValid(UserRequestDto userRequestDto, ConstraintValidatorContext context) {
        if (userRequestDto != null && validate(userRequestDto.getPassword()) && validate(userRequestDto.getRepeatPassword())) {
            return userRequestDto.getPassword().equals(userRequestDto.getRepeatPassword());
        }
        return false;
    }

    public boolean validate(String password) {
        return PASSWORD_PATTERN.matcher(password).matches();
    }
}
