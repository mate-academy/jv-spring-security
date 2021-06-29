package mate.academy.spring.dto.request;

import jakarta.validation.constraints.Size;
import mate.academy.spring.validation.Email;
import mate.academy.spring.validation.Password;

public class UserRequestDto {
    @Email
    private String email;
    @Size(min = 8)
    @Password
    private String password;

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
