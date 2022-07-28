package mate.academy.spring.util;

import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.stereotype.Component;

@Component
public class FindingUserByEmailUtil {
    private final UserService userService;

    public FindingUserByEmailUtil(UserService userService) {
        this.userService = userService;
    }

    public User getUserByEmail(String email) {
        return userService.findByEmail(email).orElseThrow(() ->
                new RuntimeException("Unable to find user by email " + email));
    }
}
