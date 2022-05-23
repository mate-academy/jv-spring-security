package mate.academy.spring.validation;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = RepeatPasswordValidator.class)
public @interface RepeatPassword {
    String message() default "Incorrect password";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
