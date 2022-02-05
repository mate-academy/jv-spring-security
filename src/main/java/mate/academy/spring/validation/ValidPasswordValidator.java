package mate.academy.spring.validation;

import mate.academy.spring.dto.request.UserRequestDto;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ValidPasswordValidator implements ConstraintValidator<ValidPassword, UserRequestDto> {

    @Override
    public boolean isValid(UserRequestDto userRequestDto, ConstraintValidatorContext context) {
        String password = userRequestDto.getPassword();
        String repeatPassword = userRequestDto.getRepeatPassword();
        if (password == null || repeatPassword == null) {
        return false;
        }
        return password.equals(repeatPassword);
    }
}
