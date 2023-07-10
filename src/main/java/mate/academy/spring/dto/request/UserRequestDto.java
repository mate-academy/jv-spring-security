package mate.academy.spring.dto.request;

import mate.academy.spring.validation.Email;
import mate.academy.spring.validation.Password;
import javax.validation.constraints.Size;

@Password
public class UserRequestDto {
    @Size(min = 11, max = 20)
    @Email
    private String email;
    @Size(min = 8, max = 16)
    private String password;
    @Size(min = 8, max = 16)
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
