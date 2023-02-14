package mate.academy.spring.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import org.springframework.beans.BeanWrapperImpl;

public class PasswordsValueMatchValidator
        implements ConstraintValidator<PasswordsValueMatch, String> {
    private String password;
    private String passwordMatch;

    @Override
    public void initialize(PasswordsValueMatch constraintAnnotation) {
        this.password = constraintAnnotation.password();
        this.passwordMatch = constraintAnnotation.passwordMatch();
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext constraintValidatorContext) {
        Object passwordValue = new BeanWrapperImpl(value).getPropertyValue(password);
        Object passwordMatchValue = new BeanWrapperImpl(value).getPropertyValue(passwordMatch);
        return passwordValue != null && passwordValue.equals(passwordMatchValue);
    }
}
