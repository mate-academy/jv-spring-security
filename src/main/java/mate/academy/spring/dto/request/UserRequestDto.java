package mate.academy.spring.dto.request;

import mate.academy.spring.validation.email.Email;
import mate.academy.spring.validation.password.Password;
import mate.academy.spring.validation.password.RepeatPassword;
import mate.academy.spring.validation.password.ValidPasswords;

@ValidPasswords
public class UserRequestDto {
    @Email
    private String email;
    @Password
    private String password;
    @RepeatPassword
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
