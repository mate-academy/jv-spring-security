package mate.academy.spring.dto.request;

import mate.academy.spring.service.validation.Email;
import mate.academy.spring.service.validation.Password;

public class UserRequestDto {
    @Email
    private String email;
    @Password
    private String password;

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
