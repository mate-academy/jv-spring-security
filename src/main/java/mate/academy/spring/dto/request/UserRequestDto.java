package mate.academy.spring.dto.request;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class UserRequestDto {
    @Email
    private String email;
    @NotNull
    @Size(min = 6)
    private String password;

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
