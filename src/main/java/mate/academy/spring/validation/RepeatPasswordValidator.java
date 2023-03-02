package mate.academy.spring.validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import mate.academy.spring.dto.request.UserRequestDto;

public class RepeatPasswordValidator
        implements ConstraintValidator<RepeatPassword, UserRequestDto> {
    private static final String PASSWORD_PATTERN = "[0-9a-zA-Z!@#$%^&*]{4,16}";
    private static final Pattern pattern = Pattern.compile(PASSWORD_PATTERN);

    @Override
    public boolean isValid(UserRequestDto requestDto,
                           ConstraintValidatorContext constraintValidatorContext) {
        String password = requestDto.getPassword();
        Matcher matcher = pattern.matcher(password);
        return password != null
                && matcher.matches()
                && password.equals(requestDto.getRepeatPassword());
    }
}
