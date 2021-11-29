package mate.academy.spring.dto.request;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import mate.academy.spring.validation.Email;
import mate.academy.spring.validation.ValidPassword;

@ValidPassword
public class UserRequestDto {
    @NotNull
    @Email
    private String email;
    @Size(min = 5, message = "Password must be between more than 5 characters")
    private String password;
    @Size(min = 5, message = " Your repeat password must be the same with password")
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
