package mate.academy.spring.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = PasswordsValueMatchValidator.class)
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface PasswordsValueMatch {

    String message() default "Fields values don't match";

    String password();

    String passwordMatch();

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };

}
