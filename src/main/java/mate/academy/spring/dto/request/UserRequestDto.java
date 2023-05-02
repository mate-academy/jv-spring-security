package mate.academy.spring.dto.request;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import mate.academy.spring.validation.email.Email;

public class UserRequestDto {
    @NotNull
    @Email
    private String email;
    @NotNull
    @Size(min = 5)
    private String password;

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
