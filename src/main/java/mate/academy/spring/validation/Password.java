package mate.academy.spring.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.validation.Constraint;

@Constraint(validatedBy = PasswordValidator.class)
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Password {
    String message() default " must be: At least 8 chars\n"
            + "Contains at least one digit\n"
            + "Contains at least one lower alpha char and one upper alpha char\n"
            + "Contains at least one char within a set of special chars (@#%$^ etc.)\n"
            + "Does not contain space, tab, etc.";
    Class<?>[] groups() default {};
    Class<?>[] payload() default {};
}
