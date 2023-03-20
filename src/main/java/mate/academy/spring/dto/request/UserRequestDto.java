package mate.academy.spring.dto.request;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import mate.academy.spring.annotation.Email;

public class UserRequestDto {
    @NotNull
    @Email
    @Size(max = 255)
    private String email;

    @NotNull
    @Size(min = 8, max = 255)
    private String password;

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
