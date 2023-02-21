package mate.academy.spring.dto.request;

import mate.academy.spring.validation.annotation.Email;
import mate.academy.spring.validation.annotation.Password;
import mate.academy.spring.validation.annotation.ValidPassword;

@ValidPassword
public class UserRequestDto {
    @Email
    private String email;
    @Password
    private String password;
    @Password
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
