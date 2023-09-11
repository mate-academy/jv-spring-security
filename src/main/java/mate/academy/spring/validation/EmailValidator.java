package mate.academy.spring.validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class EmailValidator implements ConstraintValidator<Email, String> {
    private static final String EMAIL_PATTERN = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\\\.[A-Za-z0-9_-]+)*@[^-]" +
            "[A-Za-z0-9-]+(\\\\.[A-Za-z0-9-]+)*(\\\\.[A-Za-z]{2,})$";
    /*
            The following restrictions are imposed in the email address' local part by using this regex:

            It allows numeric values from 0 to 9.
            Both uppercase and lowercase letters from a to z are allowed.
            Allowed are underscore “_”, hyphen “-“, and dot “.”
            Dot isn't allowed at the start and end of the local part.
            Consecutive dots aren't allowed.
            For the local part, a maximum of 64 characters are allowed.

            Restrictions for the domain part in this regular expression include:
            It allows numeric values from 0 to 9.
            We allow both uppercase and lowercase letters from a to z.
            Hyphen “-” and dot “.” aren't allowed at the start and end of the domain part.
            No consecutive dots.
    */
    private static final Pattern PATTERN = Pattern.compile(EMAIL_PATTERN);

    @Override
    public boolean isValid(String email, ConstraintValidatorContext constraintValidatorContext) {
        if (email == null || email.isEmpty() || email.isBlank()) {
            return false;
        }
        Matcher matcher = PATTERN.matcher(email);
        return matcher.matches();
    }
}
