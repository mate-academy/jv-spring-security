package mate.academy.spring.validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import mate.academy.spring.dto.request.UserRequestDto;

public class PasswordValidator implements ConstraintValidator<Password, UserRequestDto> {
    private static final String PASSWORD_PATTERN = "^(?=.*[A-Za-z])(?=.*\\d).{4,}$";

    @Override
    public boolean isValid(UserRequestDto userRequestDto,
                           ConstraintValidatorContext constraintValidatorContext) {
        String password = userRequestDto.getPassword();
        String repeatPassword = userRequestDto.getRepeatPassword();
        if (userRequestDto != null && isMatchPattern(password)) {
            return password.equals(repeatPassword);
        }
        return false;
    }

    private boolean isMatchPattern(String password) {
        if (password == null) {
            return false;
        }
        Pattern patterns = Pattern.compile(PASSWORD_PATTERN);
        Matcher matcher = patterns.matcher(password);
        return matcher.matches();
    }
}
