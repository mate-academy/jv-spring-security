package mate.academy.spring.validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class EmailValidation implements ConstraintValidator<Email, String> {
    /*
        - Email Address requirements:
        - Email must start with alphanumeric characters [a-zA-Z0-9].
        - Email can contain special characters like ! # $ % & ' * + / = ? ^ _ ` { | } ~ -.
        - Email must contain the "@" symbol.
        - After the "@" symbol, there must be a valid domain name.
        - A valid domain name can be an IP address
                in the format [0-9]{1,3}.[0-9]{1,3}.[0-9]{1,3}.[0-9]{1,3},
        - or it can be a sequence of alphanumeric characters and hyphens, followed by a period
                and a valid top-level domain (TLD).
        - A valid TLD consists of alphabetic characters and must be at least 2 characters long.
        - The email address can have a maximum length of 255 characters.
    */
    private static final String EMAIL_PATTERN = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}"
            + "\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
    private static final Pattern PATTERN = Pattern.compile(EMAIL_PATTERN);

    @Override
    public boolean isValid(String email, ConstraintValidatorContext constraintValidatorContext) {
        if (email == null) {
            return false;
        }

        Matcher matcher = PATTERN.matcher(email);
        return matcher.matches();
    }
}
