package mate.academy.spring.dto.request;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import mate.academy.spring.validator.Email;
import mate.academy.spring.validator.RepeatPassword;

@RepeatPassword
public class UserRequestDto {
    @Email
    private String email;
    @NotNull
    @Size(min = 8)
    private String password;
    @NotNull
    @Size(min = 8)
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
