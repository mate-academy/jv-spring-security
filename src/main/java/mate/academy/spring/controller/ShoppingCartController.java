package mate.academy.spring.controller;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import mate.academy.spring.dto.response.ShoppingCartResponseDto;
import mate.academy.spring.exception.DataProcessingException;
import mate.academy.spring.model.User;
import mate.academy.spring.service.MovieSessionService;
import mate.academy.spring.service.ShoppingCartService;
import mate.academy.spring.service.UserService;
import mate.academy.spring.service.mapper.ShoppingCartMapper;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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

    @PostMapping("/movie-sessions")
    public void addToCart(Authentication authentication, @RequestParam @NotNull @Min(1) Long movieSessionId) {
        String userEmail = authentication.getName();
        shoppingCartService.addSession(
                movieSessionService.get(movieSessionId), userService.findByEmail(userEmail)
                        .orElseThrow(() -> new DataProcessingException(
                                "User with this email is not registered")));
    }

    @GetMapping("/by-user")
    public ShoppingCartResponseDto getByUser(Authentication authentication) {
        String userEmail = authentication.getName();
        User user = userService.findByEmail(userEmail).orElseThrow(() ->
                new DataProcessingException("User with this email is not registered"));
        return shoppingCartMapper.mapToDto(shoppingCartService.getByUser(user));
    }
}
