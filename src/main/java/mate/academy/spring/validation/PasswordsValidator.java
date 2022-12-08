package mate.academy.spring.validation;

import java.util.Objects;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import org.springframework.beans.BeanWrapperImpl;

public class PasswordsValidator implements ConstraintValidator<Passwords, Object> {
    private String password;
    private String repeatPassword;

    @Override
    public void initialize(Passwords constraintAnnotation) {
        this.password = constraintAnnotation.password();
        this.repeatPassword = constraintAnnotation.repeatPassword();
    }

    @Override
    public boolean isValid(Object value,
                           ConstraintValidatorContext constraintValidatorContext) {
        Object passwordValue = new BeanWrapperImpl(value).getPropertyValue(password);
        Object repeatPasswordValue = new BeanWrapperImpl(value).getPropertyValue(repeatPassword);

        return Objects.equals(passwordValue, repeatPasswordValue);
    }
}
