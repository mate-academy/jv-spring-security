package mate.academy.spring.util;

import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

@Component
public class UserUtil {
    public User getByAuth(Authentication authentication, UserService userService) {
        String email = authentication.getName();
        return userService.findByEmail(email).orElseThrow(
                () -> new RuntimeException("Can`t find user by email: " + email));
    }
}
