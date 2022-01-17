package mate.academy.spring.controller;

import lombok.AllArgsConstructor;
import mate.academy.spring.dto.response.ShoppingCartResponseDto;
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
@AllArgsConstructor
public class ShoppingCartController {
    private final ShoppingCartService shoppingCartService;
    private final ShoppingCartMapper shoppingCartMapper;
    private final MovieSessionService movieSessionService;
    private final UserService userService;

    @PutMapping("/movie-sessions")
    public void addToCart(Authentication authentication, @RequestParam Long movieSessionId) {
        shoppingCartService.addSession(movieSessionService.get(movieSessionId),
                        userService.findByEmail(authentication.getName())
                                .orElseThrow(() -> new RuntimeException("Can't find user "
                                        + "with email " + authentication.getName()
                                        + " and movie session id "
                                        + movieSessionId)));
    }

    @GetMapping("/by-user")
    public ShoppingCartResponseDto getByUser(Authentication authentication) {
        return shoppingCartMapper.mapToDto(shoppingCartService
                .getByUser(userService.findByEmail(authentication.getName())
                .orElseThrow(() -> new RuntimeException("Can't find user with email: "
                                + authentication.getName()))));
    }
}
