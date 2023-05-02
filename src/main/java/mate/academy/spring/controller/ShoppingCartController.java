package mate.academy.spring.controller;

import mate.academy.spring.dto.response.ShoppingCartResponseDto;
import mate.academy.spring.exception.DataProcessingException;
import mate.academy.spring.model.ShoppingCart;
import mate.academy.spring.model.User;
import mate.academy.spring.service.MovieSessionService;
import mate.academy.spring.service.ShoppingCartService;
import mate.academy.spring.service.UserService;
import mate.academy.spring.service.mapper.ResponseDtoMapper;
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
    private final MovieSessionService movieSessionService;
    private final UserService userService;
    private final ResponseDtoMapper<ShoppingCartResponseDto, ShoppingCart>
            shoppingCartResponseDtoMapper;

    public ShoppingCartController(ShoppingCartService shoppingCartService,
                                  UserService userService,
                                  MovieSessionService movieSessionService,
            ResponseDtoMapper<ShoppingCartResponseDto, ShoppingCart>
                                      shoppingCartResponseDtoMapper) {
        this.shoppingCartService = shoppingCartService;
        this.userService = userService;
        this.movieSessionService = movieSessionService;
        this.shoppingCartResponseDtoMapper = shoppingCartResponseDtoMapper;
    }

    @PutMapping("/movie-sessions")
    public void addToCart(@RequestParam Authentication authentication,
                          @RequestParam Long movieSessionId) {
        shoppingCartService.addSession(
                movieSessionService.get(movieSessionId), userService.findByEmail(
                        authentication.getName()).orElseThrow(() ->
                        new DataProcessingException("Can`t"
                        + " get user by email " + authentication.getName())));
    }

    @GetMapping("/by-user")
    public ShoppingCartResponseDto getByUser(@RequestParam Authentication authentication) {
        User user = userService.findByEmail(
                authentication.getName()).orElseThrow(() -> new DataProcessingException("Can`t"
                + " get user by email " + authentication.getName()));
        return shoppingCartResponseDtoMapper.mapToDto(shoppingCartService.getByUser(user));
    }
}
