package validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = PasswordValidator.class)
@Target({ElementType.TYPE, ElementType.PARAMETER})
public @interface Password {
    String message() default "Invalid password or email";

    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
