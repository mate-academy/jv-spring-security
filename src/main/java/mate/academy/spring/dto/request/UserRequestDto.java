package mate.academy.spring.dto.request;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import mate.academy.spring.validation.Email;
import mate.academy.spring.validation.ValidPassword;

//@ValidPassword
@ValidPassword
public class UserRequestDto {
    @Email
    @Size(min = 4)
    private String email;
    @Size(min = 4)
    @NotNull
    private String password;
    @Size(min = 4)
    @NotNull
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

    public void setRepeatPassword(String repeatePassword) {
        this.repeatPassword = repeatePassword;
    }
}
