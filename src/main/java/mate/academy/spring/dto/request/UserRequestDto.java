package mate.academy.spring.dto.request;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class UserRequestDto {
    @Email
    @NotEmpty
    @NotNull
    @Size(min = 6, max = 100)
    private String email;
    @NotEmpty
    @NotNull
    @Size(min = 8, max = 30)
    private String password;
    @NotEmpty
    @NotNull
    @Size(min = 8, max = 30)
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
