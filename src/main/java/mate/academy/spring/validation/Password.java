package mate.academy.spring.validation;

import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Password {
    String message() default "{javax.validation.constraints.Password.message}";

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };
}
