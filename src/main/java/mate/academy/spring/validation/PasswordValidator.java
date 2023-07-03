package mate.academy.spring.validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import mate.academy.spring.dto.request.UserRequestDto;

public class PasswordValidator implements ConstraintValidator<Password, Object> {
    public static final String PASSWORD_PATTERN
            = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$";

    @Override
    public boolean isValid(Object userRequestDto, ConstraintValidatorContext context) {
        if (!(userRequestDto instanceof UserRequestDto)) {
            return false;
        }
        UserRequestDto user = (UserRequestDto) userRequestDto;
        return isMatch(user.getPassword(), user.getRepeatPassword());
    }

    private boolean isMatch(String password, String repeatPassword) {
        if (password == null || repeatPassword == null) {
            return false;
        }
        Pattern pattern = Pattern.compile(PASSWORD_PATTERN);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches() && password.equals(repeatPassword);
    }
}
