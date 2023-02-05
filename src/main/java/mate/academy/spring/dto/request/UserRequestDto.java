package mate.academy.spring.dto.request;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import mate.academy.spring.validation.Password;

public class UserRequestDto {
    @NotNull
    @Email
    private String email;
    @NotNull
    @Size(min = 4)
    @Password
    private String password;
    @NotNull
    @Size(min = 4)
    @Password
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
