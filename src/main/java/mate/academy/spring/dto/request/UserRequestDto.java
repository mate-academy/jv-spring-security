package mate.academy.spring.dto.request;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import mate.academy.spring.validation.Email;
import mate.academy.spring.validation.PasswordMatch;

@PasswordMatch
public class UserRequestDto {
    @Email
    private String email;
    @NotEmpty
    @Size(min = 8, max = 20)
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
