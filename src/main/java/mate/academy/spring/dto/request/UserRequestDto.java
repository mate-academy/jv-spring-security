package mate.academy.spring.dto.request;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import mate.academy.spring.validation.Email;
import mate.academy.spring.validation.ValidatePassword;

@ValidatePassword
public class UserRequestDto {
    @Email
    private String email;
    @NotNull
    @NotBlank(message = "field can't be empty")
    @Size(min = 4)
    private String password;
    @NotNull
    @NotBlank(message = "field can't be empty")
    @Size(min = 4)
    private String confirmPassword;

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }
}
