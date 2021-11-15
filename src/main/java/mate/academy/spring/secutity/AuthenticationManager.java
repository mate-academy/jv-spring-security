package mate.academy.spring.secutity;

import mate.academy.spring.model.User;

public interface AuthenticationManager {
    User authentication(Token token);
}
