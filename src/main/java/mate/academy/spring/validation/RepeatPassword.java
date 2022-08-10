package mate.academy.spring.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.validation.Constraint;

@Constraint(validatedBy = RepeatPasswordValidator.class)
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface RepeatPassword {
    String message() default "Your 'Password' and 'Repeat password' are not equals";
    Class<?>[] groups() default {};
    Class<?>[] payload() default {};
}
