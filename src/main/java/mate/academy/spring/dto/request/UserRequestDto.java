package mate.academy.spring.dto.request;

import mate.academy.spring.model.validation.Email;
import mate.academy.spring.model.validation.PasswordsMatch;

@PasswordsMatch
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
