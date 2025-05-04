package mate.academy.spring.dto.request;

import mate.academy.spring.validator.Email;
import mate.academy.spring.validator.Password;

@Password
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
