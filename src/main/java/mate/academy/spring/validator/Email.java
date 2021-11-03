package mate.academy.spring.validator;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import javax.validation.Constraint;
import javax.validation.Payload;


@Target({FIELD, PARAMETER})
@Retention(RUNTIME)
@Constraint(validatedBy = EmailValidator.class)
@Documented
public @interface Email {
    String message() default "This email does not match requirements.";
    Class<?>[] group() default {};
    Class<? extends Payload>[] payload() default {};

}
