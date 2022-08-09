package mate.academy.spring.dto.request;

import javax.validation.constraints.Email;
import javax.validation.constraints.Size;
import mate.academy.spring.validation.ValidPasswords;

@ValidPasswords
public class UserRequestDto {
    @Email
    private String email;
    @Size(min = 6)
    private String password;

    private String repeatedPassword;

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getRepeatedPassword() {
        return repeatedPassword;
    }
}
