package mate.academy.spring.dto.request;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import mate.academy.spring.validation.Password;
import org.hibernate.validator.constraints.Length;

@Password
public class UserRequestDto {
    @NotNull(message = "Please enter your email")
    @Email
    private String email;
    @NotNull(message = "Please enter your password")
    @Length(min = 4)
    private String password;
    @NotNull(message = "Please repeat your password")
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
