package mate.academy.spring.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import org.springframework.beans.BeanWrapperImpl;

public class FieldsValueMatchValidator
        implements ConstraintValidator<FieldsValueMatch, Object> {
    private String password;
    private String repeatPassword;

    public void initialize(FieldsValueMatch constraintAnnotation) {
        this.password = constraintAnnotation.password();
        this.repeatPassword = constraintAnnotation.repeatPassword();
    }

    public boolean isValid(Object value,
                           ConstraintValidatorContext context) {
        Object passwordValue = new BeanWrapperImpl(value)
                .getPropertyValue(password);
        Object repeatPasswordValue = new BeanWrapperImpl(value)
                .getPropertyValue(repeatPassword);

        if (passwordValue != null) {
            return passwordValue.equals(repeatPasswordValue);
        } else {
            return repeatPasswordValue == null;
        }
    }
}
