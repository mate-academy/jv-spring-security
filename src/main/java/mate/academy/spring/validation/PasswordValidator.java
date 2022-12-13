package mate.academy.spring.validation;

import java.util.Objects;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import org.springframework.beans.BeanWrapperImpl;

public class PasswordValidator implements ConstraintValidator<ValidPassword, Object> {
    private String password;
    private String repeatPassword;

    @Override
    public void initialize(ValidPassword constraintAnnotation) {
        this.password = constraintAnnotation.passwordField();
        this.repeatPassword = constraintAnnotation.repeatPasswordField();
    }

    @Override
    public boolean isValid(Object pass, ConstraintValidatorContext constraintValidatorContext) {
        Object passwordValue = new BeanWrapperImpl(pass).getPropertyValue(password);
        Object repeatPasswordValue = new BeanWrapperImpl(pass).getPropertyValue(repeatPassword);
        return Objects.equals(passwordValue, repeatPasswordValue);
    }
}
