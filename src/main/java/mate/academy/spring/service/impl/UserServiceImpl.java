package mate.academy.spring.service.impl;

import java.util.Optional;
import mate.academy.spring.dao.UserDao;
import mate.academy.spring.exception.DataProcessingException;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import mate.academy.spring.util.PasswordUtil;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private static final int SALT_LENGTH = 10;
    private final UserDao userDao;
    private final PasswordEncoder encoder;

    public UserServiceImpl(UserDao userDao, PasswordEncoder encoder) {
        this.userDao = userDao;
        this.encoder = encoder;
    }

    @Override
    public User add(User user) {
        String salt = PasswordUtil.getSalt(SALT_LENGTH);
        String securePassword = PasswordUtil.generateSecurePassword(user.getPassword(), salt);
        user.setPassword(securePassword);
        user.setSalt(salt);
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
}
