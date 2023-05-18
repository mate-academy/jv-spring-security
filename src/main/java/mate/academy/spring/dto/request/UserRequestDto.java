package mate.academy.spring.dto.request;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import mate.academy.spring.validation.Email;

public class UserRequestDto {
    @Email
    private String email;
    @NotNull
    @Size(min = 4, max = 64)
    private String password;
    @NotNull
    @Size(min = 4, max = 64)
    private String repeatPassword;

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getRepeatPassword() {
        return repeatPassword;
    }
}
