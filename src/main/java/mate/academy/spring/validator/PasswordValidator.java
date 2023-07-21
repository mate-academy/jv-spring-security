package mate.academy.spring.validator;

import mate.academy.spring.dto.request.UserRequestDto;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidator implements ConstraintValidator<Password, UserRequestDto> {
    private static final String PASSWORD_PATTERN = "^(?=.*[A-Za-z])(?=.*\\d).{4,}$";
    @Override
    public boolean isValid(UserRequestDto userRequestDto,
                           ConstraintValidatorContext constraintValidatorContext) {
        String password = userRequestDto.getPassword();
        String repeatPassword = userRequestDto.getRepeatPassword();
        if (userRequestDto != null && isPattern(password) && isPattern(repeatPassword)) {
            return password.equals(repeatPassword);
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
