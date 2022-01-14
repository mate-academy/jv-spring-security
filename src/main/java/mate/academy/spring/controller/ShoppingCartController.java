package mate.academy.spring.controller;

import mate.academy.spring.dto.response.ShoppingCartResponseDto;
import mate.academy.spring.model.User;
import mate.academy.spring.service.MovieSessionService;
import mate.academy.spring.service.ShoppingCartService;
import mate.academy.spring.service.UserService;
import mate.academy.spring.service.mapper.ShoppingCartMapper;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/shopping-carts")
public class ShoppingCartController {
    private final ShoppingCartService shoppingCartService;
    private final ShoppingCartMapper shoppingCartMapper;
    private final MovieSessionService movieSessionService;
    private final UserService userService;

    public ShoppingCartController(ShoppingCartService shoppingCartService,
                                  ShoppingCartMapper shoppingCartMapper,
                                  UserService userService,
                                  MovieSessionService movieSessionService) {
        this.shoppingCartService = shoppingCartService;
        this.shoppingCartMapper = shoppingCartMapper;
        this.userService = userService;
        this.movieSessionService = movieSessionService;
    }

    @PutMapping("/movie-sessions")
    public void addToCart(@RequestParam Long movieSessionId, Authentication authentication) {
        User user = getUserByEmailOrThrowException(authentication.getName());
        shoppingCartService.addSession(
                movieSessionService.get(movieSessionId), user);
    }

    @GetMapping("/by-user")
    public ShoppingCartResponseDto getByUser(Authentication authentication) {
        User user = getUserByEmailOrThrowException(authentication.getName());
        return shoppingCartMapper.mapToDto(shoppingCartService.getByUser(user));
    }

    private User getUserByEmailOrThrowException(String email) {
        return userService.findByEmail(email).orElseThrow(
                () -> new RuntimeException("Cannot find user by email: " + email)
        );
    }
}
