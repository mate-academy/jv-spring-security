package mate.academy.spring.validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import mate.academy.spring.dto.request.UserRequestDto;

public class PasswordValidation implements ConstraintValidator<Password, UserRequestDto> {
    private static final String PASSWORD_PATTERN =
            "((?=.*d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{4,20})";

    @Override
    public boolean isValid(UserRequestDto user, ConstraintValidatorContext context) {
        if (user.getPassword() == null || user.getRepeatPassword() == null) {
            return false;
        }
        if (!user.getPassword().equals(user.getRepeatPassword())) {
            return false;
        }
        Pattern pattern = Pattern.compile(PASSWORD_PATTERN);
        Matcher matcher = pattern.matcher(user.getPassword());
        return matcher.matches();
    }
}
