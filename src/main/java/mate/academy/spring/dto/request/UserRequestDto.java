package mate.academy.spring.dto.request;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import mate.academy.spring.validator.Email;
import mate.academy.spring.validator.Password;

@Password
public class UserRequestDto {
    @Email
    @NotNull
    private String email;
    @NotNull
    @Min(6)
    private String password;
    @NotNull
    @Min(6)
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

    public void setRepeatPassword(String repeatPassword) {
        this.repeatPassword = repeatPassword;
    }
}
