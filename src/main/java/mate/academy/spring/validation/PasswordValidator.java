package mate.academy.spring.validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import org.springframework.beans.BeanWrapperImpl;

public class PasswordValidator implements ConstraintValidator<Password, Object> {
    private static final String PASSWORD_PATTERN =
            "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$";

    @Override
    public boolean isValid(Object clazz, ConstraintValidatorContext constraintValidatorContext) {
        if (clazz == null) {
            return false;
        }
        String password = (String) new BeanWrapperImpl(clazz)
                .getPropertyValue("password");
        String repeatPassword = (String) new BeanWrapperImpl(clazz)
                .getPropertyValue("repeatPassword");
        if (password == null || repeatPassword == null) {
            return false;
        }
        if (!password.equals(repeatPassword)) {
            return false;
        }
        Pattern pattern = Pattern.compile(PASSWORD_PATTERN);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }
}
