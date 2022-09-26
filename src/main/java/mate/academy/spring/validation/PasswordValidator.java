package mate.academy.spring.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import mate.academy.spring.dto.request.UserRequestDto;
import mate.academy.spring.service.UserService;
import org.springframework.security.crypto.password.PasswordEncoder;

public class PasswordValidator implements ConstraintValidator<Password, UserRequestDto> {
    private final PasswordEncoder passwordEncoder;
    private final UserService userService;

    public PasswordValidator(PasswordEncoder passwordEncoder, UserService userService) {
        this.passwordEncoder = passwordEncoder;
        this.userService = userService;
    }

    @Override
    public boolean isValid(UserRequestDto userRequestDto, ConstraintValidatorContext context) {
        if (userRequestDto.getPassword() == userRequestDto.getRepeatedPassword()) {
            return userService.findByEmail(userRequestDto.getEmail()).get().getPassword()
                    == passwordEncoder.encode(userRequestDto.getPassword());
        } else {
            return false;
        }
    }
}
