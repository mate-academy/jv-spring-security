package mate.academy.spring.dto.request;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import mate.academy.spring.lib.Email;
import mate.academy.spring.lib.PasswordFieldsMatch;

@PasswordFieldsMatch
public class UserRequestDto {
    @NotNull(message = "please enter email")
    @Email
    private String email;
    @NotNull(message = "please enter password")
    @NotEmpty
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
