package mate.academy.spring.dto.request;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

public class UserRequestDto {
    @Email
    @NotEmpty(message = "Please provide email")
    private String email;
    @NotEmpty(message = "Please provide password")
    private String password;

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
