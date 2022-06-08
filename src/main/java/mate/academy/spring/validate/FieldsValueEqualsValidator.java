package mate.academy.spring.validate;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import org.springframework.beans.BeanWrapperImpl;

public class FieldsValueEqualsValidator implements ConstraintValidator<FieldsValueEquals, Object> {
    private String field;
    private String equalsField;

    @Override
    public void initialize(FieldsValueEquals constraintAnnotation) {
        this.field = constraintAnnotation.field();
        this.equalsField = constraintAnnotation.equalsField();
    }

    @Override
    public boolean isValid(Object value, ConstraintValidatorContext constraintValidatorContext) {
        Object fieldValue = new BeanWrapperImpl(value).getPropertyValue(field);
        Object equalsFieldValue = new BeanWrapperImpl(value).getPropertyValue(equalsField);
        return fieldValue != null && fieldValue.equals(equalsFieldValue);
    }
}
