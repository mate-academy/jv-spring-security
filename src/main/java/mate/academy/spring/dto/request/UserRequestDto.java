package mate.academy.spring.dto.request;

import mate.academy.spring.validation.Email;
import mate.academy.spring.validation.PasswordMatch;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@PasswordMatch
public class UserRequestDto {
    @NotEmpty
    @Email
    private String email;
    @NotEmpty
    @Size(min = 5)
    private String password;
    @NotEmpty
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
