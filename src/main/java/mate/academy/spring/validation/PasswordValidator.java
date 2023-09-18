package mate.academy.spring.validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import mate.academy.spring.dto.request.UserRequestDto;
import mate.academy.spring.exception.PasswordAuthException;

public class PasswordValidator implements ConstraintValidator<Password, UserRequestDto> {
    private static final String PASSWORD_PATTERN =
            "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$";

    @Override
    public boolean isValid(UserRequestDto userRequestDto,
                           ConstraintValidatorContext constraintValidatorContext) {
        Pattern pattern = Pattern.compile(PASSWORD_PATTERN);
        Matcher matcher = pattern.matcher(userRequestDto.getPassword());
        if (matcher.matches()) {
            return userRequestDto.getPassword().equals(userRequestDto.getRepeatPassword());
        } else {
            throw new PasswordAuthException("Password must contain at least 1 uppercase letter,"
                    + " 1 lowercase letter, 1 digit, and 1 special character");
        }
    }
}
