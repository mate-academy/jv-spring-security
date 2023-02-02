package mate.academy.spring.validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import mate.academy.spring.dto.request.UserRequestDto;

public class ValidPasswordValidator implements ConstraintValidator<ValidPassword, UserRequestDto> {
    private static final String PASSWORD_PATTERN = "(?=.*[0-9])"
            + "(?=.*[!@#$%^&*])"
            + "(?=.*[a-z])(?=.*[A-Z])"
            + "[0-9a-zA-Z!@#$%^&*]{8,}";

    @Override
    public boolean isValid(UserRequestDto userRequestDto,
                           ConstraintValidatorContext constraintValidatorContext) {
        if (userRequestDto.getPassword() == null && userRequestDto.getRepeatedPassword() == null) {
            return false;
        }
        Pattern pattern = Pattern.compile(PASSWORD_PATTERN);
        Matcher matcher = pattern.matcher(userRequestDto.getPassword());
        if (!matcher.matches()) {
            return false;
        }
        return userRequestDto.getPassword()
                .equals(userRequestDto.getRepeatedPassword());
    }
}
