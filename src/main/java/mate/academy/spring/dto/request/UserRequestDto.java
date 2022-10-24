package mate.academy.spring.dto.request;

import javax.validation.constraints.NotNull;
import mate.academy.spring.validation.Email;
import mate.academy.spring.validation.RepeatPassword;

@RepeatPassword
public class UserRequestDto {
    @NotNull
    @Email
    private String email;
    @NotNull
    private String password;
    @NotNull
    private String repeatedPassword;

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getRepeatedPassword() {
        return repeatedPassword;
    }
}
