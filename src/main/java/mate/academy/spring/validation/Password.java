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
    String message() default "Password must implement the bellow rules: "
            + "digit must occur at least once, "
            + "lower case alphabet must occur at least once, "
            + "an upper case alphabet that must occur at least once, "
            + "a special character that must occur at least once, "
            + "white spaces don’t allowed in the entire string, "
            + "at least 8 characters and at most 20 characters.";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
