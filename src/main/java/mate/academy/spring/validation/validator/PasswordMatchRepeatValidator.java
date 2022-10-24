package mate.academy.spring.validation.validator;

import java.util.Objects;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import mate.academy.spring.validation.PasswordMatchRepeat;
import org.springframework.beans.BeanWrapperImpl;

public class PasswordMatchRepeatValidator implements ConstraintValidator<PasswordMatchRepeat,
        Object> {
    private String field;
    private String fieldMatch;

    @Override
    public void initialize(PasswordMatchRepeat constraintAnnotation) {
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
