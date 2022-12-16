package mate.academy.spring.service;

import java.util.Optional;
import mate.academy.spring.model.User;
import org.springframework.security.core.Authentication;

public interface UserService {
    User add(User user);

    User get(Long id);

    User get(Authentication auth);

    Optional<User> findByEmail(String email);
}
