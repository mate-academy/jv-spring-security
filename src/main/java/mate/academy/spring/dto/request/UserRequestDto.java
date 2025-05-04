package mate.academy.spring.dto.request;

import javax.validation.constraints.Email;
import javax.validation.constraints.Size;
import mate.academy.spring.validation.Password;

@Password
public class UserRequestDto {
    @Email
    private String email;
    @Size(min = 8)
    private String password;
    @Size(min = 8)
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
