package mate.academy.spring.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.lang.reflect.Method;

public class MatchPasswordsValidator implements ConstraintValidator<MatchPasswords, Object> {
    @Override
    public boolean isValid(Object object, ConstraintValidatorContext context) {
        try {
            Method methodGetPassword = object.getClass().getMethod("getPassword");
            Method methodGetRepeatPassword = object.getClass().getMethod("getRepeatPassword");
            if(methodGetPassword.invoke(object) == null && methodGetRepeatPassword.invoke(object)==null)
                return true;
            else if(methodGetPassword.invoke(object) == null )
                return false;
            return methodGetPassword.invoke(object).equals(methodGetRepeatPassword.invoke(object));

        } catch (NoSuchMethodException ex) {
            ex.printStackTrace();
            return false;
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }
}
