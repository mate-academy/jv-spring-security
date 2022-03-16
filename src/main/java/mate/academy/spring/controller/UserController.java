package mate.academy.spring.controller;

import java.util.List;
import java.util.stream.Collectors;
import mate.academy.spring.dto.request.UserRequestDto;
import mate.academy.spring.dto.response.UserResponseDto;
import mate.academy.spring.exception.DataProcessingException;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import mate.academy.spring.service.mapper.UserMapper;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserMapper userMapper;
    private final UserService userService;

    public UserController(UserService userService, UserMapper userMapper) {
        this.userService = userService;
        this.userMapper = userMapper;
    }

    @PostMapping("/register")
    @ResponseStatus(HttpStatus.CREATED)
    public UserResponseDto create(@RequestBody UserRequestDto userRequestDto) {
        User user = userService.add(userMapper.mapToModel(userRequestDto));
        return userMapper.mapToDto(userService.add(user));
    }

    @GetMapping("/")
    public List<UserResponseDto> getAll() {
        return userService.getAll()
                .stream()
                .map(userMapper::mapToDto)
                .collect(Collectors.toList());
    }

    @GetMapping("/by-email")
    public UserResponseDto getByEmail(@RequestParam String email) {
        User user = userService.findByEmail(email).orElseThrow(
                () -> new DataProcessingException("Invalid email"));
        return userMapper.mapToDto(user);
    }
}
