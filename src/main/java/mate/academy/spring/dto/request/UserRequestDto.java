package mate.academy.spring.dto.request;

import mate.academy.spring.validation.CorrectRepeatPassword;
import mate.academy.spring.validation.Email;
import mate.academy.spring.validation.Password;

public class UserRequestDto {
    @Email
    private String email;
    @Password
    @CorrectRepeatPassword
    private String password;
    @CorrectRepeatPassword
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
