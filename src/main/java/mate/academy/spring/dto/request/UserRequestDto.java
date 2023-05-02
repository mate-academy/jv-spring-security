package mate.academy.spring.dto.request;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import mate.academy.spring.validation.Password;

@Password
public class UserRequestDto {
    @NotNull
    @Email
    private String email;
    @NotNull
    @Size(min = 3, max = 64)
    private String password;
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
