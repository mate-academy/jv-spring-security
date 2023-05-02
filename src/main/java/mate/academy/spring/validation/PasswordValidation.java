package mate.academy.spring.validation;

import mate.academy.spring.dto.request.UserRequestDto;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidation implements ConstraintValidator<Password, UserRequestDto> {

    @Override
    public boolean isValid(UserRequestDto userRequestDto, ConstraintValidatorContext constraintValidatorContext) {
        if (userRequestDto.getPassword() == null) {
            return false;
        }
        return userRequestDto.getPassword().equals(userRequestDto.getRepeatPassword());
    }
}
