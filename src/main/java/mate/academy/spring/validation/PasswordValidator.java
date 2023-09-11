package mate.academy.spring.validation;

import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import mate.academy.spring.dto.request.UserRequestDto;

public class PasswordValidator implements ConstraintValidator<ValidPassword, UserRequestDto> {
    private static final String PASSWORD_PATTERN = "^(?=.*[0-9])"
            + "(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,20}$";
    private static final Pattern PATTERN = Pattern.compile(PASSWORD_PATTERN);

    @Override
    public boolean isValid(UserRequestDto dto, ConstraintValidatorContext context) {
        if (!dto.getPassword().equals(dto.getRepeatPassword())
                && dto.getPassword().isEmpty() || dto.getPassword().isBlank()
                || Objects.isNull(dto.getPassword())) {
            return false;
        }
        Matcher matcher = PATTERN.matcher(dto.getPassword());
        return matcher.matches();
    }
}
