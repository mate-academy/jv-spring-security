package mate.academy.spring.validation;

import javax.validation.Payload;

public @interface PasswordsMatch {
    String message() default "Passwords do not match";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
