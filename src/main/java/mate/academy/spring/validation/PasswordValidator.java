package mate.academy.spring.validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import mate.academy.spring.dto.request.UserRequestDto;

public class PasswordValidator implements ConstraintValidator<Password, UserRequestDto> {
    private static final String PASSWORD_PATTERN =
            "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{5,10}$";

    @Override
    public boolean isValid(UserRequestDto userRequestDto, ConstraintValidatorContext context) {
        if (userRequestDto.getPassword() != null
                && userRequestDto.getRepeatedPassword() != null
                && userRequestDto.getPassword().equals(userRequestDto.getRepeatedPassword())) {
            Pattern pattern = Pattern.compile(PASSWORD_PATTERN);
            Matcher matcher = pattern.matcher(userRequestDto.getPassword());
            if (matcher.matches()) {
                return true;
            }
            return false;
        } else {
            return false;
        }
    }
}
