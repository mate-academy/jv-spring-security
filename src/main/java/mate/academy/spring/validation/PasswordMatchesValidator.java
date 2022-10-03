package mate.academy.spring.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import mate.academy.spring.dto.request.UserRequestDto;

public class PasswordMatchesValidator implements ConstraintValidator<PasswordMatches, Object> {

    @Override
    public void initialize(PasswordMatches constraintAnnotation) {
    }

    @Override
    public boolean isValid(Object requestObject, ConstraintValidatorContext context) {
        UserRequestDto user = (UserRequestDto) requestObject;
        return user.getPassword().equals(user.getRepeatPassword());
    }
}
