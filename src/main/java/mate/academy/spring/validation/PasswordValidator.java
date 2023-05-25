package mate.academy.spring.validation;

import mate.academy.spring.dto.request.UserRequestDto;
import org.springframework.beans.BeanWrapperImpl;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Objects;

public class PasswordValidator implements ConstraintValidator<Password, UserRequestDto> {
    private String password;
    private String repeatPassword;

    @Override
    public void initialize(Password matching) {
        this.password = matching.password();
        this.repeatPassword = matching.repeatPassword();
    }

    @Override
    public boolean isValid(UserRequestDto value, ConstraintValidatorContext constraintValidatorContext) {
        Object passwordValue = new BeanWrapperImpl(value).getPropertyValue(password);
        Object confirmPasswordValue = new BeanWrapperImpl(value).getPropertyValue(repeatPassword);
        return Objects.equals(passwordValue, confirmPasswordValue);
    }
}
