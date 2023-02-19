package mate.academy.spring.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import mate.academy.spring.dto.request.UserRequestDto;
import mate.academy.spring.validator.annotation.PasswordValidation;

public class RepeatedPasswordValidator
        implements ConstraintValidator<PasswordValidation, UserRequestDto> {
    @Override
    public boolean isValid(UserRequestDto userRequestDto,
                           ConstraintValidatorContext constraintValidatorContext) {
        return userRequestDto.getPassword() != null
                && userRequestDto.getPassword().equals(userRequestDto.getRepeatPassword());
    }
}
