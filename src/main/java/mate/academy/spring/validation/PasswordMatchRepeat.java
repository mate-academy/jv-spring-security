package mate.academy.spring.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.validation.Constraint;
import javax.validation.Payload;
import mate.academy.spring.validation.validator.PasswordMatchRepeatValidator;

@Constraint(validatedBy = PasswordMatchRepeatValidator.class)
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface PasswordMatchRepeat {
    String message () default "Field value not equal to field match value";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

    String field();

    String fieldMatch();

    @Target({ElementType.TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    @interface List {
        PasswordMatchRepeat[] value();
    }
}
