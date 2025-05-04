package mate.academy.spring.validation;

import java.lang.reflect.Field;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class EqualPasswordsValidator implements ConstraintValidator<EqualPasswords, Object> {
    private static final String VALUE_IS_NULL = "Passwords must not be null";
    private static final String VALUES_NOT_EQUAL = "Passwords are not equal";
    private String password;
    private String repeatPassword;

    @Override
    public void initialize(EqualPasswords constraintAnnotation) {
        password = constraintAnnotation.firstValue();
        repeatPassword = constraintAnnotation.secondValue();
    }

    @Override
    public boolean isValid(Object clazz, ConstraintValidatorContext constraintValidatorContext) {
        constraintValidatorContext.disableDefaultConstraintViolation();
        Object valueOne = getValue(clazz, password);
        Object valueTwo = getValue(clazz, repeatPassword);
        if (valueOne == null || valueTwo == null) {
            customMessage(constraintValidatorContext, VALUE_IS_NULL);
            return false;
        }
        if (!valueOne.equals(valueTwo)) {
            customMessage(constraintValidatorContext, VALUES_NOT_EQUAL);
            return false;
        }
        return true;
    }

    private Object getValue(Object clazz, String fieldName) {
        Class<?> currentClazz = clazz.getClass();
        try {
            Field declaredField = currentClazz.getDeclaredField(fieldName);
            declaredField.setAccessible(true);
            return declaredField.get(clazz);
        } catch (Exception e) {
            throw new RuntimeException("Can not find field "
                    + fieldName + " in class " + currentClazz, e);
        }
    }

    private void customMessage(ConstraintValidatorContext context, String message) {
        context.buildConstraintViolationWithTemplate(message).addConstraintViolation();
    }
}
