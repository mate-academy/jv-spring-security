package mate.academy.spring.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.validation.Constraint;
import javax.validation.Payload;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = MatchesPasswordValidator.class)
public @interface RepeatedPasswordEquals {
    String message() default "The re-password must match the password!";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
