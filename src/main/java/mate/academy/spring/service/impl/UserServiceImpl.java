package mate.academy.spring.service.impl;

import java.util.List;
import java.util.Optional;
import mate.academy.spring.config.SecurityConfig;
import mate.academy.spring.dao.UserDao;
import mate.academy.spring.exception.DataProcessingException;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private final UserDao userDao;
    private final SecurityConfig securityConfig;

    public UserServiceImpl(UserDao userDao, SecurityConfig securityConfig) {
        this.userDao = userDao;
        this.securityConfig = securityConfig;
    }

    @Bean
    public PasswordEncoder getEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Override
    public User add(User user) {
        String encodePassword = securityConfig.getEncoder().encode(user.getPassword());
        user.setPassword(encodePassword);
        return userDao.add(user);
    }

    @Override
    public User get(Long id) {
        return userDao.get(id).orElseThrow(
                () -> new DataProcessingException("User with id " + id + " not found"));
    }

    @Override
    public Optional<User> findByEmail(String email) {
        return userDao.findByEmail(email);
    }

    @Override
    public List<User> getAll() {
        return userDao.getAll();
    }
}
