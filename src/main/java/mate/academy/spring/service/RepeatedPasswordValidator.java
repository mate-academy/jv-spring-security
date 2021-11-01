package mate.academy.spring.service;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import mate.academy.spring.dto.request.UserRequestDto;

public class RepeatedPasswordValidator
        implements ConstraintValidator<RepeatedPassword, UserRequestDto> {
    private String password;
    private String repeatedPassword;

    @Override
    public void initialize(RepeatedPassword constraintAnnotation) {
    }

    @Override
    public boolean isValid(UserRequestDto dto,
                           ConstraintValidatorContext constraintValidatorContext) {
        return dto == null || dto.getPassword() == null || dto.getTwinPassword() == null
                ? false : dto.getPassword().equals(dto.getTwinPassword());
    }
}
