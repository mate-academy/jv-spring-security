package mate.academy.spring.validation;

import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import mate.academy.spring.dto.request.UserRequestDto;

public class PasswordValidator implements ConstraintValidator<Password, UserRequestDto> {
    private static final String PASSWORD_PATTERN = "^(?=.*?[0-9]).{4,}$";

    @Override
    public boolean isValid(UserRequestDto requestDto, ConstraintValidatorContext context) {
        if (requestDto.getPassword() == null
                || Objects.equals(requestDto.getPassword(), requestDto.getRepeatPassword())) {
            return false;
        }
        Pattern pattern = Pattern.compile(PASSWORD_PATTERN);
        Matcher matcher = pattern.matcher(requestDto.getPassword());
        return matcher.matches();
    }
}
