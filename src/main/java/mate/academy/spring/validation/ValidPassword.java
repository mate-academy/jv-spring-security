package mate.academy.spring.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.validation.Constraint;
import javax.validation.Payload;

@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = PasswordValidator.class)
@Target({ElementType.TYPE})
public @interface ValidPassword {
    String message() default "Password are not match";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
