package mate.academy.spring.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = PasswordAtRegistrationValidator.class)
@Target({ElementType.TYPE})
@Retention(value = RetentionPolicy.RUNTIME)
public @interface PasswordAtRegistration {
    String message() default "Passwords isn't equals";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
