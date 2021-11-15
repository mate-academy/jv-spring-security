package mate.academy.spring.secutity;

import java.util.List;
import mate.academy.spring.model.User;

public class AuthenticationManagerImpl implements AuthenticationManager {
    private List<AuthenticationProvider> providers;

    public AuthenticationManagerImpl(List<AuthenticationProvider> providers) {
        this.providers = providers;
    }

    @Override
    public User authentication(Token token) {
        Class<Token>[] tokens = new Class[]{token.getClass()};
        return providers.stream()
                .filter(p -> p.isSupporting(tokens))
                .findFirst()
                .get()
                .authenticate(token);
    }
}
