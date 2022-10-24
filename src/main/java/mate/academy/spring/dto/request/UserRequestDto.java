package mate.academy.spring.dto.request;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import mate.academy.spring.validation.Password;

@Password(
        password = "password",
        repeatPassword = "repeatPassword",
        message = "Passwords do not match!"
)
public class UserRequestDto {
    @Email
    private String email;
    @NotBlank
    @Size(min = 6)
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
