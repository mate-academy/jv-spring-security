package mate.academy.spring.validation;

import java.util.Objects;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import mate.academy.spring.dto.request.UserRequestDto;

public class MatchFieldsValidator implements ConstraintValidator<MatchFields, UserRequestDto> {
    @Override
    public boolean isValid(UserRequestDto userRequestDto, ConstraintValidatorContext context) {
        return Objects.equals(userRequestDto.getPassword(), userRequestDto.getRepeatPassword())
                && userRequestDto.getPassword() != null;
    }
}
