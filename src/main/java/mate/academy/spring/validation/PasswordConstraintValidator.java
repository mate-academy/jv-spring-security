package mate.academy.spring.validation;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import mate.academy.spring.dto.request.UserRequestDto;
import org.passay.DigitCharacterRule;
import org.passay.LengthRule;
import org.passay.LowercaseCharacterRule;
import org.passay.PasswordData;
import org.passay.PasswordValidator;
import org.passay.Rule;
import org.passay.RuleResult;
import org.passay.UppercaseCharacterRule;
import org.passay.WhitespaceRule;

public class PasswordConstraintValidator
        implements ConstraintValidator<ValidPassword, UserRequestDto> {
    @Override
    public boolean isValid(UserRequestDto userRequestDto,
                           ConstraintValidatorContext constraintValidatorContext) {
        List<Rule> rules = new ArrayList<>();
        rules.add(new LengthRule(8, 15));
        rules.add(new UppercaseCharacterRule(1));
        rules.add(new DigitCharacterRule(1));
        rules.add(new LowercaseCharacterRule(1));
        rules.add(new WhitespaceRule());
        PasswordValidator validator = new PasswordValidator(rules);

        String password = userRequestDto.getPassword();
        String repeatedPassword = userRequestDto.getRepeatPassword();
        if (password == null || repeatedPassword == null) {
            return false;
        }
        if (password.equals(repeatedPassword)) {
            RuleResult result = validator.validate(new PasswordData(password));
            if (result.isValid()) {
                return true;
            }
            List<String> messages = validator.getMessages(result);
            String messageTemplate = messages.stream()
                    .collect(Collectors.joining(","));
            constraintValidatorContext.buildConstraintViolationWithTemplate(messageTemplate)
                    .addConstraintViolation()
                    .disableDefaultConstraintViolation();
        }
        return false;
    }
}
