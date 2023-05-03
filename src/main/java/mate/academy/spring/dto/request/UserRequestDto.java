package mate.academy.spring.dto.request;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import mate.academy.spring.validation.Email;
import mate.academy.spring.validation.Password;

public class UserRequestDto {
    @NotNull
    @Email
    @Size(min = 5)
    private String email;
    @NotNull
    @Password
    @Size(min = 6)
    private String password;
    @NotNull
    @Size(min = 6)
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
