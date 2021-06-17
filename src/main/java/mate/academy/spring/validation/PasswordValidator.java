package mate.academy.spring.validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import mate.academy.spring.dto.request.UserRequestDto;

public class PasswordValidator implements ConstraintValidator<ValidPassword, UserRequestDto> {
    public static final Pattern VALID_PASSWORD_REGEX =
            Pattern.compile("(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}");

    @Override
    public boolean isValid(UserRequestDto userRequestDto,
                           ConstraintValidatorContext constraintValidatorContext) {
        constraintValidatorContext.disableDefaultConstraintViolation();
        return areFieldsNotNull(userRequestDto, constraintValidatorContext)
                && isPasswordValid(userRequestDto, constraintValidatorContext)
                && arePasswordsEqual(userRequestDto, constraintValidatorContext);
    }

    private boolean arePasswordsEqual(UserRequestDto userRequestDto,
                                      ConstraintValidatorContext constraintValidatorContext) {
        boolean valid = true;
        if (!userRequestDto.getPassword().equals(userRequestDto.getRepeatedPassword())) {
            valid = false;
            constraintValidatorContext.buildConstraintViolationWithTemplate(
                    "Passwords must match."
            ).addConstraintViolation();
        }
        return valid;
    }

    private boolean areFieldsNotNull(UserRequestDto userRequestDto,
                                  ConstraintValidatorContext constraintValidatorContext) {
        boolean valid = true;
        if (userRequestDto.getPassword() == null || userRequestDto.getRepeatedPassword() == null) {
            valid = false;
            constraintValidatorContext.buildConstraintViolationWithTemplate(
                    "Password field can't be null."
            ).addConstraintViolation();
        }
        return valid;
    }

    private boolean isPasswordValid(UserRequestDto userRequestDto,
                                      ConstraintValidatorContext constraintValidatorContext) {
        boolean valid = true;
        Matcher matcher = VALID_PASSWORD_REGEX.matcher(userRequestDto.getPassword());
        if (!matcher.matches()) {
            valid = false;
            constraintValidatorContext.buildConstraintViolationWithTemplate(
                    "Password must be complex."
            ).addConstraintViolation();
        }
        return valid;
    }
}
