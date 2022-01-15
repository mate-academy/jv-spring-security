package mate.academy.spring.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import mate.academy.spring.dto.request.UserRequestDto;

public class PasswordValidator implements
        ConstraintValidator<Password, Object> {

    @Override
    public void initialize(Password arg0) {
    }

    @Override
    public boolean isValid(Object candidate, ConstraintValidatorContext arg1) {
        UserRequestDto user = (UserRequestDto) candidate;
        return user.getPassword().equals(user.getRepeatPassword());
    }
}
