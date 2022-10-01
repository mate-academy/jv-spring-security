package mate.academy.spring.dto.request;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import mate.academy.spring.util.Email;

public class UserRequestDto {
    @NotNull
    @Email
    private String email;
    @NotNull
    @Size(min = 6, max = 18)
    private String password;

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
