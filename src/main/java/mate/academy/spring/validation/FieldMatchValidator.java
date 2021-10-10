package mate.academy.spring.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import mate.academy.spring.dto.request.UserRequestDto;

public class FieldMatchValidator implements ConstraintValidator<FieldMatch, UserRequestDto> {

    private String password;
    private String repeatPassword;
    private String message;

    @Override
    public void initialize(FieldMatch constraintAnnotation) {
        password = constraintAnnotation.first();
        repeatPassword = constraintAnnotation.second();
        message = constraintAnnotation.message();
    }

    @Override
    public boolean isValid(UserRequestDto userRequestDto, ConstraintValidatorContext context) {
        String password = userRequestDto.getPassword();
        String repeatPassword = userRequestDto.getSecondPassword();
        return password.equals(repeatPassword);
    }
}
