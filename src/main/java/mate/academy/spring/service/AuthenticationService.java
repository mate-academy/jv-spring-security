package mate.academy.spring.service;

import mate.academy.spring.model.User;

public interface AuthenticationService {

    Boolean comparePassword(String password, String repeatPassword);

    User register(String email, String password);
}
