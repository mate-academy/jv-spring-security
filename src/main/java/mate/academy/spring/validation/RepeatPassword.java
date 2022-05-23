package mate.academy.spring.validation;

import javax.validation.Payload;

public @interface RepeatPassword {
    String message() default "Incorrect password";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
