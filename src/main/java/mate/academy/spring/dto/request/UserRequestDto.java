package mate.academy.spring.dto.request;

import mate.academy.spring.validation.Email;
import mate.academy.spring.validation.Password;

@Password
public class UserRequestDto {
    @Email
    private String email;
    private String password;
    private String repeatedPassword;

    public String getRepeatedPassword() {
        return repeatedPassword;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
