package mate.academy.spring.validation;

import java.util.Objects;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class MatchFieldsValidator implements ConstraintValidator<MatchFields, Object> {
    private final String firstField;
    private final String secondField;

    public MatchFieldsValidator(MatchFields annotation) {
        this.firstField = annotation.first();
        this.secondField = annotation.second();
    }

    @Override
    public boolean isValid(Object value, ConstraintValidatorContext context) {
        return (!Objects.equals(firstField, secondField) || firstField != null)
                && firstField.equals(secondField);
    }
}
