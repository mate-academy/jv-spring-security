package mate.academy.spring.dto.request;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import mate.academy.spring.validation.Email;

public class UserRequestDto {
    @NotNull(message = "Please enter email")
    @Size(min = 5, max = 15, message = "Email size must be min=5 and max=15")
    @Email
    private String email;
    @NotNull(message = "Please enter password")
    @Size(min = 5, max = 15, message = "Password size must be min=5 and max=15")
    private String password;

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
