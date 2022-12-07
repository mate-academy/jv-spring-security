package mate.academy.spring.validation;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import org.springframework.security.core.context.SecurityContextHolder;

public class CorrectRepeatPasswordValidator
        implements ConstraintValidator<CorrectRepeatPassword, String> {
    private static final Map<String, String> passwordsComparator = new HashMap<>();

    @Override
    public boolean isValid(String password, ConstraintValidatorContext constraintValidatorContext) {
        String name = SecurityContextHolder.getContext().getAuthentication().getName();
        if (passwordsComparator.containsKey(name)) {
            boolean passwordComparison = Objects.equals(passwordsComparator.get(name), password);
            passwordsComparator.clear();
            return passwordComparison;
        }
        passwordsComparator.put(name, password);
        return true;
    }
}
