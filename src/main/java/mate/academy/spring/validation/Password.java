package mate.academy.spring.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = PasswordValidator.class)
@Target({ElementType.PARAMETER, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Password {
    String message() default "Password must contain as minimum: "
            + " 1 uppercase letter, 1 lowercase letter, 1 special character, 1 number, "
            + " longer or equals 8 characters and shorted or equals them 16 characters";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
