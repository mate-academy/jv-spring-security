package mate.academy.spring.dto.request;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import mate.academy.spring.validation.ValidRepeatPassword;

@ValidRepeatPassword
public class UserRequestDto {
    @Size(min = 3)
    @Email
    private String email;
    @NotNull
    @Size(min = 4, max = 16)
    private String password;
    @NotNull
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
