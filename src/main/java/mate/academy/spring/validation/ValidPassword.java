package mate.academy.spring.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.validation.Constraint;
import javax.validation.Payload;


@Constraint(validatedBy = PasswordValidator.class)
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidPassword {
    String message() default "Passwords do not match!";
    String passwordField();
    String repeatPasswordField();
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
