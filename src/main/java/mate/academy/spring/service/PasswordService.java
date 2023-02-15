package mate.academy.spring.service;

import org.springframework.security.crypto.password.PasswordEncoder;

public interface PasswordService {
    public PasswordEncoder getEncoder();
}
