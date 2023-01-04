package mate.academy.spring.dto.request;

import javax.validation.constraints.Min;
import mate.academy.spring.validation.Email;
import mate.academy.spring.validation.Password;
import mate.academy.spring.validation.Passwords;

@Passwords(
        password = "password",
        repeatPassword = "repeatPassword"
)
public class UserRequestDto {
    @Email
    private String email;
    @Password
    @Min(8)
    private String password;
    @Min(8)
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
