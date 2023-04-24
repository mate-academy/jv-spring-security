package mate.academy.spring.service.impl;

import java.util.Optional;
import mate.academy.spring.config.SecurityConfig;
import mate.academy.spring.dao.UserDao;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private final UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public User add(User user) {
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(SecurityConfig.class);
        PasswordEncoder bean = applicationContext.getBean(PasswordEncoder.class);
        String securePassword = bean.encode(user.getPassword());
        user.setPassword(securePassword);
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
