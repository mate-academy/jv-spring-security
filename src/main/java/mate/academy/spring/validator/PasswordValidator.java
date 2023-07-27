package mate.academy.spring.validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import mate.academy.spring.dto.request.UserRequestDto;

public class PasswordValidator implements ConstraintValidator<Password, Object> {
    public static final String PASSWORD_PATTERN = "^(?=.*[0-9])(?=.*[a-z])"
            + "(?=.*[A-Z])(?=.*[@#$%^&+=!])(?=\\S+$).{8,}$";

    @Override
    public boolean isValid(Object userRequestDto,
                           ConstraintValidatorContext constraintValidatorContext) {
        if (!(userRequestDto instanceof UserRequestDto)) {
            return false;
        }
        UserRequestDto user = (UserRequestDto) userRequestDto;
        return isValid(user.getPassword(), user.getRepeatPassword())
                && isMatch(user.getPassword(), user.getRepeatPassword());
    }

    private boolean isValid(String password, String repeatPassword) {
        if (password == null || repeatPassword == null) {
            return false;
        }
        Pattern pattern = Pattern.compile(PASSWORD_PATTERN);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }

    private boolean isMatch(String password, String repeatPassword) {
        if (password == null || repeatPassword == null) {
            return false;
        }
        return password.equals(repeatPassword);
    }
}
