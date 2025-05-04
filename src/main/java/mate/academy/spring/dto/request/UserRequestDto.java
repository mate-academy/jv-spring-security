package mate.academy.spring.dto.request;

import jakarta.validation.constraints.Size;
import mate.academy.spring.validation.Email;

public class UserRequestDto {
    @Email
    private String email;
    @Size(min = 4, message = "Password length must not be less than 4")
    private String password;

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
