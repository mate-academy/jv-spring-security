package mate.academy.spring.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import org.apache.commons.beanutils.BeanUtils;

public final class PasswordValidator implements ConstraintValidator<Password, Object> {
    private String originalPass;
    private String repeatedPass;

    @Override
    public void initialize(final Password constraintAnnotation) {
        originalPass = constraintAnnotation.first();
        repeatedPass = constraintAnnotation.second();
    }

    @Override
    public boolean isValid(final Object value,
                           final ConstraintValidatorContext constraintValidatorContext) {
        try {
            final String firstPass = BeanUtils.getProperty(value, originalPass);
            final String secondPass = BeanUtils.getProperty(value, repeatedPass);
            return firstPass != null && firstPass.equals(secondPass);

        } catch (Exception e) {
            throw new RuntimeException("Can't validate the passwords", e);
        }
    }
}
