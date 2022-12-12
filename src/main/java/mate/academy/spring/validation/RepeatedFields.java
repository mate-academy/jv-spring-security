package mate.academy.spring.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.validation.Constraint;
import javax.validation.Payload;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = MatchesFieldValidator.class)
public @interface RepeatedFields {
    String message() default "Repeated field must match field";

    String field();
    String repeatField();

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
