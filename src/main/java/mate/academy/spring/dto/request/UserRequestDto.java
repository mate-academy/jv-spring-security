package mate.academy.spring.dto.request;

import javax.validation.constraints.Size;
import mate.academy.spring.validation.Email;
import mate.academy.spring.validation.PasswordsMatch;

@PasswordsMatch
public class UserRequestDto {
    @Email
    private String email;
    @Size(min = 5)
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
