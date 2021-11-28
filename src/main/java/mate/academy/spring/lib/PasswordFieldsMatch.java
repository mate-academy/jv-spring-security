package mate.academy.spring.lib;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = PasswordsFieldMatchValidator.class)
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface PasswordFieldsMatch {
    String message() default "Password and repeated password don't match";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}