package mate.academy.spring.validation;

import java.util.Objects;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;

public class RepeatPasswordValidator implements ConstraintValidator<RepeatPassword, Object> {
    private BeanWrapper beanWrapper;
    private String password;
    private String repeatPassword;

    public RepeatPasswordValidator(BeanWrapper beanWrapper) {
        this.beanWrapper = beanWrapper;
    }

    @Override
    public void initialize(RepeatPassword constraintAnnotation) {
        password = constraintAnnotation.password();
        repeatPassword = constraintAnnotation.repeatPassword();
    }

    @Override
    public boolean isValid(Object value, ConstraintValidatorContext context) {
        Object passwordObj = new BeanWrapperImpl(value).getPropertyValue(password);
        Object repeatedPasswordObj = new BeanWrapperImpl(value).getPropertyValue(repeatPassword);
        return Objects.equals(passwordObj, repeatedPasswordObj);
    }
}
