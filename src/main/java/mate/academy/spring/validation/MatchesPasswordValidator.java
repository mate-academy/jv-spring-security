package mate.academy.spring.validation;

import java.util.Objects;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import mate.academy.spring.dto.request.UserRequestDto;

public class MatchesPasswordValidator implements ConstraintValidator<RepeatedPasswordEquals,
        UserRequestDto> {
    @Override
    public void initialize(RepeatedPasswordEquals constraintAnnotation) {
    }

    @Override
    public boolean isValid(UserRequestDto userRequestDto, ConstraintValidatorContext context) {
        return Objects.equals(userRequestDto.getRepeatPassword(), userRequestDto.getPassword());
    }
}
