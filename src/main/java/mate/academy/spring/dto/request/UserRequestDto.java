package mate.academy.spring.dto.request;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import mate.academy.spring.validation.Email;

public class UserRequestDto {
    @Email
    private String email;
    @Size(min = 8)
    private String password;
    @NotNull
    private String repeatPassword;

    @AssertTrue (message = "Password and repeat password are not equal")
    private boolean isPasswordsEqual() {
        return password.equals(repeatPassword);
    }

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
