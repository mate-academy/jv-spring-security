package mate.academy.spring.validation;

import java.util.regex.Pattern;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import mate.academy.spring.dto.request.UserRequestDto;

public class PasswordValidator implements ConstraintValidator<Password, UserRequestDto> {
    private static final String PASSWORD_PATTERN = "^(?=.*[a-z])(?=.*[A-Z])"
            + "(?=.*\\d)[a-zA-Z\\d!@#$%^&*()_+\\-=\\[\\]{};:'\"\\\\|,.<>/?]{8,}$";
    private static final Pattern pattern = Pattern.compile(PASSWORD_PATTERN);

    @Override
    public boolean isValid(UserRequestDto userRequestDto,
                           ConstraintValidatorContext constraintValidatorContext) {
        String password = userRequestDto.getPassword();
        String repeatPassword = userRequestDto.getRepeatPassword();
        if (password != null && repeatPassword != null
                && pattern.matcher(password).matches()) {
            return password.equals(repeatPassword);
        }
        return false;
    }
}
