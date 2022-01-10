package mate.academy.spring.dto.request;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import mate.academy.spring.validator.Email;

public class UserRequestDto {
    @Email
    private String email;
    @NotNull
    @Size(min = 8)
    private String password;

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
