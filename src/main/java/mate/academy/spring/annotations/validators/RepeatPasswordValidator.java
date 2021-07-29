package mate.academy.spring.annotations.validators;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import mate.academy.spring.annotations.RepeatPassword;
import org.springframework.beans.BeanWrapperImpl;

public class RepeatPasswordValidator implements ConstraintValidator<RepeatPassword, Object> {

    private final String password = "password";
    private final String repeatPassword = "repeatPassword";

    @Override
    public boolean isValid(Object dto, ConstraintValidatorContext context) {
        Object passwordValue = new BeanWrapperImpl(dto).getPropertyValue(password);
        Object repeatPasswordValue = new BeanWrapperImpl(dto).getPropertyValue(repeatPassword);
        return passwordValue != null && passwordValue.equals(repeatPasswordValue);
    }
}
