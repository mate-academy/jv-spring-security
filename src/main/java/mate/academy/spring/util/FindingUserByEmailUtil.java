package mate.academy.spring.util;

import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

@Component
public class FindingUserByEmailUtil {
    private static final String ERROR_TEXT = "Unable find user by email";
    private final UserService userService;

    public FindingUserByEmailUtil(UserService userService) {
        this.userService = userService;
    }

    public User getUserByEmail(Authentication authentication) {
        return userService.findByEmail(authentication.getName()).orElseThrow(() ->
                new RuntimeException(ERROR_TEXT + " " + authentication.getName()));
    }

    public User getUserByEmail(String email) {
        return userService.findByEmail(email).orElseThrow(() ->
                new RuntimeException(ERROR_TEXT + " " + email));
    }
}
