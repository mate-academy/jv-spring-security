package mate.academy.spring.dto.request;

import javax.validation.constraints.Email;
import mate.academy.spring.validation.Password;
import mate.academy.spring.validation.ValidatePassword;

@ValidatePassword
public class UserRequestDto {
    @Email
    private String email;
    @Password
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

    public void setRepeatPassword(String repeatPassword) {
        this.repeatPassword = repeatPassword;
    }
}
