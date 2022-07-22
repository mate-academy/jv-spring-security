package mate.academy.spring.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import mate.academy.spring.dto.request.UserRequestDto;

public class PasswordValidator implements ConstraintValidator<Password, UserRequestDto> {
    private static final int MIN_SIZE_PASSWORD = 8;
    private static final int MAX_SIZE_PASSWORD = 15;
    private static final String SPECIAL_CHARS_PASSWORD
            = "@#$%^`<>&+=\"!ºª·#~%&'¿¡€,:;*/+-.=_\\[\\]\\(\\)\\|\\_\\?\\\\";
    private static final String VALID_PASSWORD_REGEX
            = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*["
            + SPECIAL_CHARS_PASSWORD + "])(?=\\S+$).{"
            + MIN_SIZE_PASSWORD + ","
            + MAX_SIZE_PASSWORD + "}$";

    @Override
    public boolean isValid(UserRequestDto userRequestDto, ConstraintValidatorContext context) {
        String password = userRequestDto.getPassword();
        return password != null
                && password.matches(VALID_PASSWORD_REGEX)
                && password.equals(userRequestDto.getRepeatPassword());
    }
}
