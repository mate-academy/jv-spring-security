package mate.academy.spring.validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import mate.academy.spring.dto.request.UserRequestDto;

public class PasswordValidator implements
        ConstraintValidator<ValidPassword, UserRequestDto> {
    private static final String PASSWORD_PATTERN = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])"
            + "(?=.*[^\\w\\s]).{6,}";

    @Override
    public boolean isValid(UserRequestDto userRequestDto,
                           ConstraintValidatorContext context) {
        String password = userRequestDto.getPassword();
        String repeatPassword = userRequestDto.getRepeatPassword();
        if (password.isEmpty()) {
            context.buildConstraintViolationWithTemplate("Password can not be null");
            return false;
        }
        if (!password.equals(repeatPassword)) {
            context.buildConstraintViolationWithTemplate("Passwords don't match");
            return false;
        }
        Pattern pattern = Pattern.compile(PASSWORD_PATTERN);
        Matcher matcher = pattern.matcher(password);
        if (!matcher.matches()) {
            context.buildConstraintViolationWithTemplate(
                    "- password must contains at least one number;"
                            + System.lineSeparator()
                                + "- password must contains at least one special character;"
                            + System.lineSeparator()
                            + "- password must contains at least one Latin letter in lower case;"
                            + System.lineSeparator() + "- password must contains at least "
                            + "one uppercase latin letter" + System.lineSeparator()
                            + "- password must consists of at least 6 of "
                            + "the above characters");
            return false;
        }
        return true;
    }
}
