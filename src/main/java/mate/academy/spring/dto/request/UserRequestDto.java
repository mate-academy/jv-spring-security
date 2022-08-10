package mate.academy.spring.dto.request;

import javax.validation.constraints.NotNull;
import mate.academy.spring.validation.Email;
import mate.academy.spring.validation.Password;
import mate.academy.spring.validation.RepeatPassword;

@RepeatPassword
public class UserRequestDto {
    @Email
    private String email;
    @Password
    private String password;
    @NotNull
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
