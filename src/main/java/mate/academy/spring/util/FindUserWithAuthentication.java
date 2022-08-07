package mate.academy.spring.util;

import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

@Component
public class FindUserWithAuthentication {
    private final UserService userService;

    public FindUserWithAuthentication(UserService userService) {
        this.userService = userService;
    }

    public User findUser(Authentication authentication) {
        String email = authentication.getName();
        return userService.findByEmail(email).orElseThrow(
                () -> new RuntimeException(
                        "Can't find user with such email " + email));
    }
}
