package mate.academy.spring.validation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.validation.Payload;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Password {
    String message() default "{javax.validation.constraints.Password.message}";

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };
}
