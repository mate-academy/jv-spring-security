package mate.academy.spring.dto.request;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import mate.academy.spring.validation.Email;
import mate.academy.spring.validation.RepeatPassword;

@RepeatPassword(password = "password", repeatPassword = "repeatPassword")
public class UserRequestDto {
    @Email
    private String email;
    @NotEmpty
    @Size(min = 8, max = 25)
    private String password;
    @NotEmpty
    @Size(min = 8, max = 25)
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
