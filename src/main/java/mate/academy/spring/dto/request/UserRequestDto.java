package mate.academy.spring.dto.request;

import javax.validation.constraints.Size;
import javax.validation.constraints.Email;
import mate.academy.spring.validation.PasswordMatches;

@PasswordMatches
public class UserRequestDto {
    @Email
    private String email;
    @Size(min = 8)
    private String password;
    @Size(min = 8)
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
