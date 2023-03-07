package mate.academy.spring.dto.request;

import javax.validation.constraints.NotNull;
import mate.academy.spring.validator.Email;

public class UserRequestDto {
    @Email
    private String email;
    @NotNull(message = "Please provide a password")
    private String password;

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
