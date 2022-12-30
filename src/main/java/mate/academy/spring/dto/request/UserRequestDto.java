package mate.academy.spring.dto.request;

import mate.academy.spring.validation.Email;
import mate.academy.spring.validation.EqualPasswords;

@EqualPasswords(firstValue = "password", secondValue = "repeatPassword")
public class UserRequestDto {
    @Email
    private String email;
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
