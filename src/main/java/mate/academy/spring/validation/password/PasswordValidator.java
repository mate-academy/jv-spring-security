package mate.academy.spring.validation.password;

import java.lang.reflect.Field;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PasswordValidator implements ConstraintValidator<ValidPasswords, Object> {
    @Override
    public boolean isValid(Object object, ConstraintValidatorContext context) {
        Class<?> clazz = object.getClass();
        String password = null;
        String repeatPassword = null;
        for (Field field : clazz.getDeclaredFields()) {
            if (field.isAnnotationPresent(Password.class)) {
                password = getValue(field, object);
            }
            if (field.isAnnotationPresent(RepeatPassword.class)) {
                repeatPassword = getValue(field, object);
            }
        }

        return password != null && password.equals(repeatPassword);
    }

    private String getValue(Field field, Object object) {
        try {
            field.setAccessible(true);
            return (String) field.get(object);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(String.format(
                    "Can't get value from field %s in class %s",
                    field.getName(),
                    object.getClass().getName()
            ), e);
        }
    }
}
