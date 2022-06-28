package mate.academy.spring.dto.request;

import javax.validation.constraints.Size;
import mate.academy.spring.validation.Email;
import mate.academy.spring.validation.Password;
import org.jetbrains.annotations.NotNull;

@Password
public class UserRequestDto {
    @Email
    private String email;
    @NotNull
    @Size(min = 6, max = 30)
    private String password;

    private String repeatPassword;

    public String getEmail() {
        return email;
    }

    @NotNull
    public String getPassword() {
        return password;
    }

    public String getRepeatPassword() {
        return repeatPassword;
    }
}
