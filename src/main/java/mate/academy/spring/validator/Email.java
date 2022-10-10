package mate.academy.spring.validator;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = EmailValidator.class)
//Tell here, where we can put this annotation: parameter and field
@Target({ElementType.FIELD})
//When this annotation will be available
@Retention(RetentionPolicy.RUNTIME)
public @interface Email {
    String message() default "Wrong input! You have entered an invalid email";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
