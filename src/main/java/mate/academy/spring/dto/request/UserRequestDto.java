package mate.academy.spring.dto.request;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import mate.academy.spring.lib.ConfirmPassword;

@ConfirmPassword
public class UserRequestDto {
    @Email(message = "Email is not valid.", regexp = "^(.+)@(.+)$")
    @NotEmpty(message = "Email cannot be empty.")
    private String email;
    @NotNull
    @Min(value = 3, message = "Password length must be at least 3 characters.")
    private String password;
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
