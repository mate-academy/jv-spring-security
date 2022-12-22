package mate.academy.spring.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ValidPasswordValidator implements ConstraintValidator<ValidPassword, Class<?>> {
    private static final int MAX_PASSWORD_LENGTH = 64;
    private static final int MIN_PASSWORD_LENGTH = 8;

    @Override
    public boolean isValid(Class<?> clazz, ConstraintValidatorContext context) {
        String password = getFieldStringValue(clazz, "password");
        String repeatedPassword = getFieldStringValue(clazz, "repeatedPassword");
        return isPasswordValid(password) && password.equals(repeatedPassword);
    }

    private static boolean isPasswordValid(String password) {
        return password != null
                && password.length() >= MIN_PASSWORD_LENGTH
                && password.length() <= MAX_PASSWORD_LENGTH;
    }

    private static String getFieldStringValue(Class<?> clazz, String fieldName) {
        try {
            return (String) clazz.getField(fieldName).get(String.class);
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(
                    "Class " + clazz.getName() + " is missing field: " + fieldName, e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(
                    "Class " + clazz.getName()
                            + " field " + fieldName + "must be of String type", e);
        }
    }
}
