package mate.academy.spring.validation;

import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import mate.academy.spring.dto.request.UserRequestDto;

public class PasswordValidator implements ConstraintValidator<Password, UserRequestDto> {
/*
    Secure Password requirements:
    Password must contain at least one digit [0-9].
    Password must contain at least one lowercase Latin character [a-z].
    Password must contain at least one uppercase Latin character [A-Z].
    Password must contain at least one special character like ! @ # & ( ).
    Password must contain a length of at least 8 characters and a maximum of 255 characters.
*/
private static final String PASSWORD_PATTERN = "^(?=.*[0-9])(?=.*[a-z])(?="
        + ".*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,255}$";
private static final Pattern pattern = Pattern.compile(PASSWORD_PATTERN);

    @Override
    public boolean isValid(UserRequestDto userRequestDto,
                           ConstraintValidatorContext constraintValidatorContext) {
        if (userRequestDto.getPassword() == null
                || !Objects.equals(userRequestDto.getPassword(),
                userRequestDto.getRepeatPassword())) {
            return false;
        }
        Matcher matcher = pattern.matcher(userRequestDto.getPassword());
        return matcher.matches();
    }
}
