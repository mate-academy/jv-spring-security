package mate.academy.spring.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MatchPasswordsValidator implements ConstraintValidator<MatchPasswords, Object> {
    @Override
    public boolean isValid(Object object, ConstraintValidatorContext context) {
        try {
            Method methodGetPassword = object.getClass().getMethod("getPassword");
            Method methodGetRepeatPassword = object.getClass().getMethod("getRepeatPassword");
            return methodGetPassword.invoke(object).equals(methodGetRepeatPassword.invoke(object));
        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
            throw new RuntimeException("Error - " + e.getMessage(), e);
        }
    }
}
