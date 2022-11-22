package mate.academy.spring.dto.request;

import mate.academy.spring.validation.Email;
import mate.academy.spring.validation.MatchPasswords;
import mate.academy.spring.validation.ValidPassword;

@MatchPasswords
public class UserRequestDto {
    @Email
    private String email;
    @ValidPassword
    private String password;
    @ValidPassword
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
