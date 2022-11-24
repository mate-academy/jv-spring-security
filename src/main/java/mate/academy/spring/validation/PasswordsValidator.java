package mate.academy.spring.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordsValidator implements ConstraintValidator<ValidPassword, Object> {
    private static final String PASSWORD_PATTERN =
            "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[*.!@$%^&(){}\\[\\]:;<>,?/~_+=|\\-\\\\]).{8,16}$";
    @Override
    public boolean isValid(Object object, ConstraintValidatorContext context) {
        String password;
        String repeatPassword;
        try {
            Method methodGetPassword = object.getClass().getMethod("getPassword");
            Method methodGetRepeatPassword = object.getClass().getMethod("getRepeatPassword");
            password = (String) methodGetPassword.invoke(object);
            repeatPassword = (String) methodGetRepeatPassword.invoke(object);
        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
            throw new RuntimeException("Error - " + e.getMessage(), e);
        }
        Pattern pattern = Pattern.compile(PASSWORD_PATTERN);
        if (password == null || !pattern.matcher(password).matches()) {
            return false;
        }
        return password.equals(repeatPassword);
    }
}
