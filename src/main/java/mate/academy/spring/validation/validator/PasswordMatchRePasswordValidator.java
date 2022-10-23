package mate.academy.spring.validation.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import mate.academy.spring.validation.PasswordMatchRePassword;
import org.springframework.beans.BeanWrapperImpl;
import java.util.Objects;

public class PasswordMatchRePasswordValidator implements ConstraintValidator<
        PasswordMatchRePassword, Object> {
    private String field;
    private String fieldMatch;

    @Override
    public void initialize(PasswordMatchRePassword constraintAnnotation) {
        this.field = constraintAnnotation.field();
        this.fieldMatch = constraintAnnotation.fieldMatch();
    }

    @Override
    public boolean isValid(Object value, ConstraintValidatorContext context) {
        Object fieldValue = new BeanWrapperImpl(value).getPropertyValue(field);
        Object fieldMatchValue = new BeanWrapperImpl(value).getPropertyValue(fieldMatch);
        return Objects.equals(fieldValue, fieldMatchValue);
    }
}
