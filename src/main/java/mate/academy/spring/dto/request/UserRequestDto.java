package mate.academy.spring.dto.request;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import mate.academy.spring.validation.PasswordConfirm;

@PasswordConfirm(message = "passwords are not equal")
public class UserRequestDto {
    @NotNull
    private String email;
    @NotNull
    @Size(min = 6)
    private String password;
    @NotNull
    @Size(min = 6)
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
