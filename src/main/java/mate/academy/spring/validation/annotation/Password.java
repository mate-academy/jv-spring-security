package mate.academy.spring.validation.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.validation.Constraint;
import javax.validation.Payload;
import mate.academy.spring.validation.PasswordValidator;

@Constraint(validatedBy = PasswordValidator.class)
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Password {
    String message() default "Invalid password. It's need to contain: \n"
            + "- One digit \n"
            + "- One UpperCase letter \n"
            + "- No special symbols \n"
            + "- From 8 to 20 symbols";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
