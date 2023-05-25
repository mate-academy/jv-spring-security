package mate.academy.spring.dto.request;

import mate.academy.spring.validation.Email;
import mate.academy.spring.validation.Password;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Password(password = "password",
        repeatPassword = "repeatPassword",
        message = "Password and Confirm Password must be matched!")
public class UserRequestDto {
    @Email
    private String email;
    @NotNull
    @Min(5)
    private String password;

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
