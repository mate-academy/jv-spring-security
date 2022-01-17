package mate.academy.spring.service.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import mate.academy.spring.dto.request.UserRequestDto;

public class PasswordValidator implements ConstraintValidator<PasswordValidation, Object> {
    @Override
    public boolean isValid(Object dto, ConstraintValidatorContext constraintValidatorContext) {
        if (dto instanceof UserRequestDto) {
            UserRequestDto userRequestDto = (UserRequestDto) dto;
            String password = userRequestDto.getPassword();
            return password != null && password.equals(userRequestDto.getRepeatPassword());
        }
        return false;
    }
}
