package mate.academy.spring.dto.request;

import javax.validation.constraints.NotNull;
import validation.Email;

public class UserRequestDto {
    @NotNull
    @Email
    private String email;
    @NotNull
    private String password;

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
