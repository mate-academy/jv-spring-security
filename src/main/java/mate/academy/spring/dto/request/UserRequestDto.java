package mate.academy.spring.dto.request;

import javax.validation.constraints.Email;
import javax.validation.constraints.Size;
import mate.academy.spring.validation.Password;

public class UserRequestDto {
    @Email
    @Size(min = 8)
    private String email;
    @Size(min = 4)
    @Password
    private String password;
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
