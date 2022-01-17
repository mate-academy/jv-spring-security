package mate.academy.spring.dto.request;

import javax.validation.constraints.NotNull;
import mate.academy.spring.validation.Email;
import mate.academy.spring.validation.PasswordAndRepeatPassword;

@PasswordAndRepeatPassword
public class UserRequestDto {
    @Email
    private String email;
    private String password;
    @NotNull
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
