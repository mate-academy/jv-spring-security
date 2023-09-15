package mate.academy.spring.validator;

import java.util.regex.Pattern;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import mate.academy.spring.dto.request.UserRequestDto;

public class PasswordValidator implements ConstraintValidator<Password, UserRequestDto> {
    private static final String PASSWORD_REGEX = "^.{5,40}$";
    private static final Pattern EMAIL_PATTERN = Pattern.compile(PASSWORD_REGEX);

    @Override
    public boolean isValid(UserRequestDto userRequestDto,
                           ConstraintValidatorContext constraintValidatorContext) {
        String password = userRequestDto.getPassword();
        String repeatPassword = userRequestDto.getRepeatPassword();
        return isNotNull(userRequestDto) && password.equals(repeatPassword)
                && isValidPasswordPattern(password);
    }

    private boolean isNotNull(UserRequestDto userRequestDto) {
        return userRequestDto != null && userRequestDto.getPassword() != null
                && userRequestDto.getRepeatPassword() != null;
    }

    private boolean isValidPasswordPattern(String password) {
        return EMAIL_PATTERN.matcher(password).matches();
    }
}
