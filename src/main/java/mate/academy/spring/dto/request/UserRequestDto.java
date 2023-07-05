package mate.academy.spring.dto.request;

import javax.validation.constraints.Size;
import mate.academy.spring.lib.Email;
import mate.academy.spring.lib.Password;

public class UserRequestDto {
    @Email
    private String email;
    @Password
    @Size(max = 25)
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
