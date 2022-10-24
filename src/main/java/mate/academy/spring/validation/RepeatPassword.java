package mate.academy.spring.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.validation.Constraint;
import javax.validation.Payload;

@Target({ElementType.TYPE})
@Constraint(validatedBy = RepeatedPasswordValidator.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface RepeatPassword {
    String message() default "Password and repeated password don't match";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
