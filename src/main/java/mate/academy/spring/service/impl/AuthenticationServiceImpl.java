package mate.academy.spring.service.impl;

import mate.academy.spring.dto.request.UserRequestDto;
import mate.academy.spring.exception.AuthenticationException;
import mate.academy.spring.model.User;
import mate.academy.spring.service.AuthenticationService;
import mate.academy.spring.service.ShoppingCartService;
import mate.academy.spring.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationServiceImpl implements AuthenticationService {
    private final UserService userService;
    private final ShoppingCartService shoppingCartService;

    public AuthenticationServiceImpl(UserService userService,
                                     ShoppingCartService shoppingCartService) {
        this.userService = userService;
        this.shoppingCartService = shoppingCartService;
    }

    @Override
    public User register(UserRequestDto userRequestDto) throws AuthenticationException {
        if (userRequestDto.getPassword().equals(userRequestDto.getRepeatPassword())) {
            User user = new User();
            user.setEmail(userRequestDto.getEmail());
            user.setPassword(user.getPassword());
            userService.add(user);
            shoppingCartService.registerNewShoppingCart(user);
            return user;
        }
        throw new AuthenticationException("Passwords don't match");
    }
}
