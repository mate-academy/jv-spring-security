package mate.academy.spring.dto.request;

import mate.academy.spring.validation.Email;
import mate.academy.spring.validation.PasswordsValueMatch;

@PasswordsValueMatch(
        password = "password",
        passwordMatch = "repeatPassword")
public class UserRequestDto {
    @Email
    private String email;
    private String password;
    private String repeatPassword;

    public String getRepeatPassword() {
        return repeatPassword;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
