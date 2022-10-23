package mate.academy.spring.service.impl;

import java.util.Optional;
import mate.academy.spring.config.SecurityConfig;
import mate.academy.spring.dao.UserDao;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private final UserDao userDao;
    private final SecurityConfig passwordEncryptor;

    public UserServiceImpl(UserDao userDao, SecurityConfig passwordEncryptor) {
        this.userDao = userDao;
        this.passwordEncryptor = passwordEncryptor;
    }

    @Override
    public User add(User user) {
        user.setPassword(passwordEncryptor.getEncoder().encode(user.getPassword()));
        return userDao.add(user);
    }

    @Override
    public User get(Long id) {
        return userDao.get(id).orElseThrow(
                () -> new RuntimeException("User with id " + id + " not found"));
    }

    @Override
    public Optional<User> findByEmail(String email) {
        return userDao.findByEmail(email);
    }
}
