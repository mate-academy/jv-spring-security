package mate.academy.spring.validation;

import java.util.regex.Pattern;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import mate.academy.spring.dto.request.UserRequestDto;

public class PasswordValidator implements ConstraintValidator<Password, UserRequestDto> {
    private static final Pattern EMAIL_PATTERN = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])"
            + "(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,100}$");

    @Override
    public boolean isValid(UserRequestDto user,
                           ConstraintValidatorContext context) {
        context.disableDefaultConstraintViolation();
        return isPasswordNotNull(user, context)
                && isPasswordEquals(user, context)
                && isPasswordMatchesPattern(user, context);
    }

    private boolean isPasswordMatchesPattern(UserRequestDto user,
                                             ConstraintValidatorContext context) {
        boolean valid = true;
        if (!EMAIL_PATTERN.matcher(user.getPassword()).matches()) {
            valid = false;
            context.buildConstraintViolationWithTemplate("Password must contain "
                    + "minimum 8 and maximum 100 characters, "
                    + "at least one uppercase letter, "
                    + "one lowercase letter, one number and one special character @$!%*?&")
                    .addConstraintViolation();
        }
        return valid;
    }

    private boolean isPasswordEquals(UserRequestDto user,
                                     ConstraintValidatorContext context) {
        boolean valid = true;
        if (!user.getPassword().equals(user.getRepeatPassword())) {
            valid = false;
            context.buildConstraintViolationWithTemplate("Both passwords must be the same")
                    .addConstraintViolation();
        }
        return valid;
    }

    private boolean isPasswordNotNull(UserRequestDto user,
                                     ConstraintValidatorContext context) {
        boolean valid = true;
        if (user.getPassword() == null || user.getRepeatPassword() == null) {
            valid = false;
            context.buildConstraintViolationWithTemplate("Password can't be null")
                    .addConstraintViolation();
        }
        return valid;
    }
}
