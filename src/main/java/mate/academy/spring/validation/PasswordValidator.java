package mate.academy.spring.validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import mate.academy.spring.dto.request.UserRequestDto;

public class PasswordValidator implements ConstraintValidator<Password, UserRequestDto> {
    private static final String PASSWORD_PATTERN = "^.{8,40}$";

    @Override
    public boolean isValid(UserRequestDto dto,
            ConstraintValidatorContext constraintValidatorContext) {
        String password = dto.getPassword();
        String repeatedPassword = dto.getRepeatedPassword();
        if (dto != null && isPattern(password) && isPattern(repeatedPassword)) {
            return password.equals(repeatedPassword);
        }
        return false;
    }

    private boolean isPattern(String password) {
        if (password != null) {
            Pattern patterns = Pattern.compile(PASSWORD_PATTERN);
            Matcher matcher = patterns.matcher(password);
            return matcher.matches();
        }
        return false;
    }
}
