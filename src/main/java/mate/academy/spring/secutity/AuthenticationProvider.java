package mate.academy.spring.secutity;

import mate.academy.spring.model.User;

public interface AuthenticationProvider {
    User authenticate(Token token);

    boolean isSupporting(Class<? extends Token>[] classes);
}
