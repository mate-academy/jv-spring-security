package mate.academy.spring.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = RepeatingPasswordValidator.class)
@Target(value = ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface RepeatingPassword {
    String message() default "Your passwords are not the same";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
