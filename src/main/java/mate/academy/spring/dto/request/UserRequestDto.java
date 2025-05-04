package mate.academy.spring.dto.request;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import mate.academy.spring.validation.email.Email;
import mate.academy.spring.validation.password.Password;

@Password
public class UserRequestDto {
    @NotNull
    @Email
    private String email;
    @Size(min = 5, max = 15)
    private String password;
    private String repeatPassword;

    public String getRepeatPassword() {
        return repeatPassword;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
