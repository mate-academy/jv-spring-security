package mate.academy.spring.dto.request;

import javax.validation.constraints.NotNull;
import mate.academy.spring.validation.Email;
import mate.academy.spring.validation.PasswordsEqual;

@PasswordsEqual
public class UserRequestDto {
    @Email
    private String email;
    @NotNull
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
