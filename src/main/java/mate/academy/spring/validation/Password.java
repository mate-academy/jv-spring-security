package mate.academy.spring.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = PasswordValidator.class)
@Target({ElementType.PARAMETER, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Password {
    String message() default "invalid. Password must contain as minimum: " +
            "uppercase letter, 1 lowercase letter, 1 special character, 1 number, 8 characters";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
