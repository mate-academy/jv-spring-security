package mate.academy.spring.validation;

import java.util.Objects;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import org.springframework.beans.BeanWrapperImpl;

public class MatchesFieldValidator implements ConstraintValidator<RepeatedFields, Object> {
    private String field;
    private String repeatedField;

    @Override
    public void initialize(RepeatedFields constraintAnnotation) {
        field = constraintAnnotation.field();
        repeatedField = constraintAnnotation.repeatField();
    }

    @Override
    public boolean isValid(Object value, ConstraintValidatorContext context) {
        Object fieldValue = new BeanWrapperImpl(value)
                .getPropertyValue(field);
        Object repeatedFieldValue = new BeanWrapperImpl(value)
                .getPropertyValue(repeatedField);
        return Objects.equals(fieldValue, repeatedFieldValue);
    }
}
