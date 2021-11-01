package mate.academy.spring.service;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import javax.validation.Constraint;
import javax.validation.Payload;

@Target({TYPE})
@Retention(RUNTIME)
@Constraint(validatedBy = RepeatedPasswordValidator.class)
@Documented
public @interface RepeatedPassword {
    String message() default "The repeated password does not match the password.";
    Class<?>[] group() default {};
    Class<? extends Payload>[] payload() default {};
}
