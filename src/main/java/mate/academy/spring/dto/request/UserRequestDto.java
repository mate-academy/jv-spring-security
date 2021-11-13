package mate.academy.spring.dto.request;

import mate.academy.spring.lib.Email;
import mate.academy.spring.lib.PasswordFieldsMatch;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@PasswordFieldsMatch(
        field = "password",
        fieldMatch = "verifyPassword")
public class UserRequestDto {
    @NotNull(message = "please enter email")
    @Email
    private String email;
    @NotNull(message = "please enter password")
    @Size(min = 6, message = "password must be greater than 6 characters")
    private String password;
    @NotNull(message = "please repeat the password")
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
