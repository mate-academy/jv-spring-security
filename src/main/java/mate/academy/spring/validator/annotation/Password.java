package mate.academy.spring.validator.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.validation.Constraint;
import javax.validation.Payload;
import mate.academy.spring.validator.PasswordValidator;

@Constraint(validatedBy = PasswordValidator.class)
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Password {
    String message() default "Password should contain at least 8 characters,"
            + " at least one digit and no whitespaces.";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
