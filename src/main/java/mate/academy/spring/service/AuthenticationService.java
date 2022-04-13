package mate.academy.spring.service;

import mate.academy.spring.dto.request.UserRequestDto;
import mate.academy.spring.exception.AuthenticationException;
import mate.academy.spring.model.User;

public interface AuthenticationService {
    User register(UserRequestDto userRequestDto) throws AuthenticationException;
}
