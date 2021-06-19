package mate.academy.spring.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import mate.academy.spring.dto.request.UserRequestDto;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;

public class PasswordValidator implements ConstraintValidator<Password, UserRequestDto> {
    private final UserService userService;
    private static final String PASSWORD_PATTERN =
            "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$";
    private static final Pattern pattern = Pattern.compile(PASSWORD_PATTERN);

    public PasswordValidator(UserService userService) {
        this.userService = userService;
    }

    @Override
    public boolean isValid(UserRequestDto userRequestDto,
                           ConstraintValidatorContext constraintValidatorContext) {
        Matcher matcher = pattern.matcher(userRequestDto.getPassword());
        return matcher.matches() && isCorrect(userRequestDto.getEmail(), userRequestDto.getPassword());
    }

    private boolean isCorrect(String inputEmail, String inputPassword) {
        User requestedUser = userService.findByEmail(inputEmail).get();
        String nativePassword = requestedUser.getPassword();
        return userService.findByEmail(inputEmail).isPresent() && nativePassword.equals(inputPassword);
    }
}