package mate.academy.spring.dto.request;

import mate.academy.spring.validation.Email;
import mate.academy.spring.validation.PasswordMatch;

@PasswordMatch
public class UserRequestDto {
    @Email
    private String email;
    private String password;
    private String passwordRepeat;

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getPasswordRepeat() {
        return passwordRepeat;
    }
}
