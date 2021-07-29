package mate.academy.spring.annotations.validators;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import mate.academy.spring.annotations.RepeatPassword;

public class RepeatPasswordValidator implements ConstraintValidator<RepeatPassword, Object> {
    @Override
    public boolean isValid(Object dto, ConstraintValidatorContext context) {
        Field[] declaredFields = dto.getClass().getDeclaredFields();
        List<String> fields = Arrays.stream(declaredFields)
                .peek(field -> field.setAccessible(true))
                .map(Field::getName)
                .collect(Collectors.toList());
        try {
            if (fields.contains("password") && fields.contains("repeatPassword")) {
                Field password = dto.getClass().getDeclaredField("password");
                Field repeatPassword = dto.getClass().getDeclaredField("repeatPassword");
                password.setAccessible(true);
                repeatPassword.setAccessible(true);
                return password.get(dto).equals(repeatPassword.get(dto));
            }
        } catch (IllegalAccessException | NoSuchFieldException e) {
            e.printStackTrace();
            throw new RuntimeException(e.getMessage(), e);
        }
        return false;
    }
}
