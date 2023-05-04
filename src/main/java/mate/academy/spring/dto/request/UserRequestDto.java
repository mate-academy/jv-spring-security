package mate.academy.spring.dto.request;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import mate.academy.spring.validator.Email;
import mate.academy.spring.validator.PasswordRepeated;

@PasswordRepeated
public class UserRequestDto {
    @NotNull
    @Email
    private String email;
    @NotNull
    @Size(min = 4, max = 255)
    private String password;

    @NotNull
    @Size(min = 4, max = 255)
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
