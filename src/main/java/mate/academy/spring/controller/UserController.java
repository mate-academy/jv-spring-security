package mate.academy.spring.controller;

import mate.academy.spring.dto.response.UserResponseDto;
import mate.academy.spring.model.User;
import mate.academy.spring.service.mapper.ResponseDtoMapper;
import mate.academy.spring.util.FindingUserByEmailUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
    private final FindingUserByEmailUtil findingUserByEmailUtil;
    private final ResponseDtoMapper<UserResponseDto, User> userResponseDtoMapper;

    public UserController(FindingUserByEmailUtil findingUserByEmailUtil,
                          ResponseDtoMapper<UserResponseDto, User> userResponseDtoMapper) {
        this.findingUserByEmailUtil = findingUserByEmailUtil;
        this.userResponseDtoMapper = userResponseDtoMapper;
    }

    @GetMapping("/by-email")
    public UserResponseDto findByEmail(@RequestParam String email) {
        User user = findingUserByEmailUtil.getUserByEmail(email);
        return userResponseDtoMapper.mapToDto(user);
    }
}
