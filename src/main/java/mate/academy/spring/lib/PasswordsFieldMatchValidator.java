package mate.academy.spring.lib;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PasswordsFieldMatchValidator implements ConstraintValidator<PasswordFieldsMatch, String> {
    private String field;
    private String fieldMatch;

    @Override
    public void initialize(PasswordFieldsMatch constraintAnnotation) {
        this.field = constraintAnnotation.field();
        this.fieldMatch = constraintAnnotation.fieldMatch();
    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        return field.equals(fieldMatch);
    }
}
