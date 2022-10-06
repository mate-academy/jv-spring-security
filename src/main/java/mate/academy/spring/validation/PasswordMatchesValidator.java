package mate.academy.spring.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import mate.academy.spring.dto.request.UserRequestDto;

public class PasswordMatchesValidator implements ConstraintValidator<PasswordMatches, Object> {

    @Override
    public boolean isValid(Object requestUser, ConstraintValidatorContext context) {
        UserRequestDto user = (UserRequestDto) requestUser;
        return user.getPassword().equals(user.getRepeatPassword());
    }
}
