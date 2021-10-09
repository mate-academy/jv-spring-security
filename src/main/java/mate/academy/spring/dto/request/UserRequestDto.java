package mate.academy.spring.dto.request;

import mate.academy.spring.validation.email.Email;
import mate.academy.spring.validation.password.Password;

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
