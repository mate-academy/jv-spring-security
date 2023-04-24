package mate.academy.spring.dto.request;

import javax.validation.constraints.NotNull;
import mate.academy.spring.validation.ValidPassword;

@ValidPassword
public class UserRequestDto {
    private String email;
    private String password;
    @NotNull
    private String repeatPassword;

    public String getEmail() {
        return email;
    }

    public String getRepeatPassword() {
        return repeatPassword;
    }

    public String getPassword() {
        return password;
    }
}
