package mate.academy.spring.validation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.validation.Constraint;
import javax.validation.Payload;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = PasswordValidator.class)
public @interface Password {
    String message() default "Passwords must match,"
            + " also the password must contain letters of different registers,"
            + " at least one symbol and a number, and be at least 8 characters";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
