package mate.academy.spring.validation;

import java.util.Objects;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import org.springframework.beans.BeanWrapperImpl;

public class PasswordValidator implements ConstraintValidator<ValidatePassword, Object> {
    private String password;
    private String repeatedPassword;

    @Override
    public void initialize(ValidatePassword constraintAnnotation) {
        this.password = constraintAnnotation.password();
        this.repeatedPassword = constraintAnnotation.repeatedPassword();
    }

    @Override
    public boolean isValid(Object user, ConstraintValidatorContext constraintValidatorContext) {
        Object passwordValue = new BeanWrapperImpl(user).getPropertyValue(password);
        Object repeatedPasswordValue = new BeanWrapperImpl(user)
                .getPropertyValue(repeatedPassword);
        return Objects.equals(passwordValue, repeatedPasswordValue);
    }
}
