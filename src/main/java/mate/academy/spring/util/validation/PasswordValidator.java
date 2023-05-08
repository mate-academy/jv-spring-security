package mate.academy.spring.util.validation;

import java.util.regex.Pattern;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import mate.academy.spring.dto.request.UserRequestDto;

public class PasswordValidator implements ConstraintValidator<Password, UserRequestDto> {
    private static final String PASSWORD_PATTERN = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])"
            + "(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$";

    @Override
    public boolean isValid(UserRequestDto user, ConstraintValidatorContext context) {
        Pattern pattern = Pattern.compile(PASSWORD_PATTERN);
        if (user.getPassword() != null && pattern.matcher(user.getPassword()).matches()) {
            return user.getPassword().equals(user.getRepeatPassword());
        }
        return false;
    }
}
