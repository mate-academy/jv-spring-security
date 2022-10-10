package mate.academy.spring.validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import mate.academy.spring.dto.request.UserRequestDto;

public class PasswordValidator implements ConstraintValidator<ValidPassword, UserRequestDto> {
    private static final String PASSWORD_VALIDATION_PATTERN =
            "(?=^.{8,}$)(?=.*\\d)(?=.*[!@#$%^&*]+)(?![.\\n])(?=.*[A-Z])(?=.*[a-z]).*$";

    @Override
    public boolean isValid(UserRequestDto userRequestDto,
                           ConstraintValidatorContext context) {
        if (userRequestDto != null
                && userRequestDto.getPassword() != null
                && userRequestDto.getRepeatPassword() != null) {
            Pattern pattern = Pattern.compile(PASSWORD_VALIDATION_PATTERN);
            Matcher matcher = pattern.matcher(userRequestDto.getPassword());
            return matcher.matches() && userRequestDto.getPassword()
                    .equals(userRequestDto.getRepeatPassword());
        }
        return false;
    }
}
