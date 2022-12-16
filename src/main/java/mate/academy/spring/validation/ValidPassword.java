package mate.academy.spring.validation;

import static java.lang.annotation.ElementType.TYPE;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = EmailValidator.class)
@Target({TYPE})
@Retention(value = RetentionPolicy.RUNTIME)
public @interface ValidPassword {
    String message() default "Passwords must be equal";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
