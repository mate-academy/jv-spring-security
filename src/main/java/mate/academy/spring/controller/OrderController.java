package mate.academy.spring.controller;

import java.util.List;
import java.util.stream.Collectors;
import mate.academy.spring.dto.response.OrderResponseDto;
import mate.academy.spring.exception.DataProcessingException;
import mate.academy.spring.model.User;
import mate.academy.spring.service.OrderService;
import mate.academy.spring.service.ShoppingCartService;
import mate.academy.spring.service.UserService;
import mate.academy.spring.service.mapper.OrderMapper;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class    OrderController {
    private final ShoppingCartService shoppingCartService;
    private final OrderService orderService;
    private final UserService userService;
    private final OrderMapper orderMapper;

    public OrderController(ShoppingCartService shoppingCartService,
                           OrderService orderService,
                           UserService userService,
                           OrderMapper orderMapper) {
        this.shoppingCartService = shoppingCartService;
        this.orderService = orderService;
        this.userService = userService;
        this.orderMapper = orderMapper;
    }

    @PostMapping("/complete")
    public OrderResponseDto completeOrder(Authentication auth) {
        User user = userService.findByEmail(auth.getName()).orElseThrow(() ->
                new DataProcessingException("User not found/exist. User: " + auth.getName()));
        return orderMapper.mapToDto(orderService.completeOrder(shoppingCartService
                .getByUser(user)));
    }

    @GetMapping
    public List<OrderResponseDto> getOrderHistory(Authentication auth) {
        User user = userService.findByEmail(auth.getName()).orElseThrow(() ->
                new DataProcessingException("User not found/exist. User: " + auth.getName()));
        return orderService.getOrdersHistory(user)
                .stream()
                .map(orderMapper::mapToDto)
                .collect(Collectors.toList());
    }
}
