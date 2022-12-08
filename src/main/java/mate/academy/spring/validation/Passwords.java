package mate.academy.spring.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = PasswordsValidator.class)
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface Passwords {
    String message() default "invalid. Password was not repeated correctly";

    String password();

    String repeatPassword();

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
