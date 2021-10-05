package mate.academy.spring.validation;

import java.lang.reflect.InvocationTargetException;
import java.util.Objects;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import org.apache.commons.beanutils.BeanUtils;

public class PasswordValueMatchValidator implements
        ConstraintValidator<PasswordValueMatch, Object> {
    private String password;
    private String repeatPassword;
    private String message;

    @Override
    public void initialize(final PasswordValueMatch constraintAnnotation) {
        password = constraintAnnotation.first();
        repeatPassword = constraintAnnotation.second();
        message = constraintAnnotation.message();
    }

    @Override
    public boolean isValid(Object value, ConstraintValidatorContext constraintValidatorContext) {
        Object passwordObj;
        Object repeatPasswordObj;
        try {
            passwordObj = BeanUtils.getProperty(value, password);
            repeatPasswordObj = BeanUtils.getProperty(value, repeatPassword);
        } catch (IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            throw new RuntimeException("Incorrect password");
        }
        return passwordObj != null && repeatPasswordObj != null
                && Objects.equals(passwordObj, repeatPasswordObj);
    }
}
