package mate.academy.spring.dto.request;

import mate.academy.spring.validator.Email;
import mate.academy.spring.validator.ValidPassword;

@ValidPassword
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
