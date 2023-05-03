package mate.academy.spring.validation;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = EmailValidator.class)
@Target({PARAMETER, FIELD})
@Retention(RUNTIME)
public @interface Email {
    String message() default "Invalid email";

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };
}
