package mate.academy.spring.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = FieldsMatchValidator.class)
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface FieldsValueMatch {
    String message() default "The password must match";
    Class<?> [] groups() default {};
    Class<? extends Payload>[] payload() default {};
    String first();
    String second();
}
