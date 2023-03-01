package mate.academy.spring.dto.request;

import mate.academy.spring.dto.validation.Email;
import mate.academy.spring.dto.validation.Password;
import mate.academy.spring.dto.validation.RepeatedPassword;

@RepeatedPassword
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
