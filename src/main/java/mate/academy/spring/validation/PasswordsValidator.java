package mate.academy.spring.validation;

import java.util.Objects;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.PropertyAccessorFactory;

public class PasswordsValidator implements ConstraintValidator<PasswordsValidation, Object> {
    private String firstField;
    private String secondField;

    @Override
    public void initialize(PasswordsValidation constraintAnnotation) {
        firstField = constraintAnnotation.first();
        secondField = constraintAnnotation.second();
    }

    @Override
    public boolean isValid(Object value, ConstraintValidatorContext context) {
        BeanWrapper beanWrapper = PropertyAccessorFactory.forBeanPropertyAccess(value);
        Object password = beanWrapper.getPropertyValue(firstField);
        Object passwordRepeat = beanWrapper.getPropertyValue(secondField);

        return Objects.equals(password, passwordRepeat);
    }
}
