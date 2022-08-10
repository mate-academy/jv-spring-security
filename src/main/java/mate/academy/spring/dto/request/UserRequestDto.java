package mate.academy.spring.dto.request;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

import mate.academy.spring.validation.RepeatPassword;

@RepeatPassword
public class UserRequestDto {
    @Email
    @NotNull
    private String email;
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
