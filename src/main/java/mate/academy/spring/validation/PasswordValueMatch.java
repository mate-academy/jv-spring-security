package mate.academy.spring.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.validation.Constraint;
import org.jvnet.staxex.StAxSOAPBody;

@Constraint(validatedBy = PasswordValueMatchValidator.class)
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface PasswordValueMatch {
    String message() default "Invalid password";
    Class<?>[] groups() default {};
    Class<? extends StAxSOAPBody.Payload>[] payload() default {};
    String first();
    String second();

    @Target({ElementType.TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    @interface List {
        PasswordValueMatch[] value();
    }
}
