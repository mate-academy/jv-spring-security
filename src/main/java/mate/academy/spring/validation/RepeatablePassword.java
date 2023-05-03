package mate.academy.spring.validation;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = RepeatPasswordValidation.class)
@Target(TYPE)
@Retention(RUNTIME)
public @interface RepeatablePassword {
    String message() default "Non repeating password";

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };
}
