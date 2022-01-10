package mate.academy.spring.controller;

import java.util.NoSuchElementException;
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
    public void addToCart(Authentication authentication, @RequestParam Long movieSessionId) {
        User user = userService.findByEmail(authentication.getName()).orElseThrow(() -> new
                NoSuchElementException("User not found"));
        shoppingCartService.addSession(
                movieSessionService.get(movieSessionId), userService.get(user.getId()));
    }

    @GetMapping("/by-user")
    public ShoppingCartResponseDto getByUser(Authentication authentication) {
        User user = userService.findByEmail(authentication.getName()).orElseThrow(() ->
                new NoSuchElementException("User not found"));
        return shoppingCartMapper.mapToDto(shoppingCartService.getByUser(user));
    }
}
