package mate.academy.spring.dto.request;

import mate.academy.spring.validation.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class UserRequestDto {
    @Email
    private String email;
    @NotNull(message = "Please enter password")
    @Size(min = 6, message = "Password must be greater then 2")
    private String password;

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
