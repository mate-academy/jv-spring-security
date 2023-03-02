package mate.academy.spring.dto.request;

import mate.academy.spring.validation.ConfirmPassword;
import mate.academy.spring.validation.Email;
import mate.academy.spring.validation.Password;

@ConfirmPassword
public class UserRequestDto {
    @Email
    private String email;
    @Password
    private String password;
    private String repeatPassword;

    public String getRepeatPassword() {
        return repeatPassword;
    }

    public void setRepeatPassword(String repeatPassword) {
        this.repeatPassword = repeatPassword;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
