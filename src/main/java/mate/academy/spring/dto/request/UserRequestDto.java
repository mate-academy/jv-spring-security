package mate.academy.spring.dto.request;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import mate.academy.spring.validation.PasswordsMatch;

@PasswordsMatch
public class UserRequestDto {
    @NotNull
    @Email
    private String email;
    @NotNull
    @Min(4)
    private String password;
    @NotNull
    @Min(4)
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
