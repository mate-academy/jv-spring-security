package mate.academy.spring.dto.request;

import mate.academy.spring.validation.EmailCustom;
import mate.academy.spring.validation.Password;

@Password
public class UserRequestDto {
    @EmailCustom
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
