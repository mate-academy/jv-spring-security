package mate.academy.spring.dto.request;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class UserRequestDto {
    @Email(message = "Not valid email")
    @NotNull(message = "Please enter email")
    @Size(min = 4)
    private String email;
    @NotNull(message = "Please enter password")
    @Size(min = 6)
    private String password;

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
