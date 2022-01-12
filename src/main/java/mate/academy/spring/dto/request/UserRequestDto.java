package mate.academy.spring.dto.request;

import javax.validation.constraints.Size;
import mate.academy.spring.lib.PasswordMatch;
import mate.academy.spring.lib.ValidEmail;

@PasswordMatch
public class UserRequestDto {
    @ValidEmail
    private String email;
    @Size(min = 3)
    private String password;
    private String repeatPassword;

    public String getRepeatPassword() {
        return repeatPassword;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
