package mate.academy.spring.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import org.springframework.beans.BeanWrapperImpl;

public class PasswordValidator
        implements ConstraintValidator<Password, Object> {
    private String password;
    private String repeatPassword;

    public void initialize(Password constraintAnnotation) {
        this.password = constraintAnnotation.password();
        this.repeatPassword = constraintAnnotation.repeatPassword();
    }

    public boolean isValid(Object value,
                           ConstraintValidatorContext context) {
        Object fieldPassword = new BeanWrapperImpl(value)
                .getPropertyValue(password);
        Object fieldRepeatPassword = new BeanWrapperImpl(value)
                .getPropertyValue(repeatPassword);
        return fieldPassword != null && fieldPassword.equals(fieldRepeatPassword);
    }
}
