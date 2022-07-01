package mate.academy.spring.service.impl;

import mate.academy.spring.dao.UserDao;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.security.SecureRandom;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    private static final int STRENGTH = 10;

    private final UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public User add(User user) {
        String encodedPassword
                = new BCryptPasswordEncoder(STRENGTH, new SecureRandom())
                .encode(user.getPassword());
        user.setPassword(encodedPassword);
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
