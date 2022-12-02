package mate.academy.spring.dto.request;

import mate.academy.spring.validation.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class UserRequestDto {
    @Email
    private String email;
    @NotNull
    @Min(value = 8)
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
