package mate.academy.spring.service.impl;

import mate.academy.spring.service.PasswordService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class PasswordServiceImpl implements PasswordService {
    @Override
    public PasswordEncoder getEncoder() {
        return new BCryptPasswordEncoder();
    }
}
