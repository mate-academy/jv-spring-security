package mate.academy.spring.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.validation.Constraint;
import javax.validation.Payload;
import mate.academy.spring.annotations.validators.RepeatPasswordValidator;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = RepeatPasswordValidator.class)
public @interface RepeatPassword {
    String message() default "repeatPassword not equals to password";

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };
}
