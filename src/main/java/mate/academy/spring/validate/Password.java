package mate.academy.spring.validate;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = PasswordValidator.class)
@Target(value = ElementType.TYPE)
@Retention(value = RetentionPolicy.RUNTIME)
public @interface Password {
    String message() default "Mail or Passwords is not valid.";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
