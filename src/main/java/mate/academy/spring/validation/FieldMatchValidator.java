package mate.academy.spring.validation;

import java.lang.reflect.InvocationTargetException;
import java.util.Objects;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import org.apache.commons.beanutils.BeanUtils;

public class FieldMatchValidator implements ConstraintValidator<FieldMatch, Object> {

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
    public boolean isValid(Object value, ConstraintValidatorContext context) {
        Object passwordObject;
        Object secondPasswordObject;
        try {
            passwordObject = BeanUtils.getProperty(value, password);
            secondPasswordObject = BeanUtils.getProperty(value, repeatPassword);
        } catch (IllegalAccessException
                | InvocationTargetException | NoSuchMethodException e) {
            throw new RuntimeException("Incorrect password");
        }
        return passwordObject != null && Objects.equals(passwordObject, secondPasswordObject);
    }
}
