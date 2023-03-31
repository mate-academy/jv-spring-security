package validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import mate.academy.spring.dto.request.UserRequestDto;

public class PasswordValidator implements ConstraintValidator<Password, UserRequestDto> {
    private static final String PASSWORD_PATTERN = "^[A-Za-z0-9]";

    @Override
    public boolean isValid(UserRequestDto dto, ConstraintValidatorContext context) {
        if (dto.getPassword() != null && dto.getPassword().equals(dto.getRepeatPassword())) {
            Pattern pattern = Pattern.compile(PASSWORD_PATTERN);
            Matcher matcher = pattern.matcher(dto.getPassword());
            return matcher.matches();
        }
        return false;
    }
}
