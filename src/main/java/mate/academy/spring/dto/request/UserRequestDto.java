package mate.academy.spring.dto.request;

import mate.academy.spring.validation.ValidEmail;
import mate.academy.spring.validation.ValidPassword;

@ValidPassword
public class UserRequestDto {
    @ValidEmail
    private String email;
    private String password;
    private String repeatPassword;

    public String getEmail() {
        return email;
    }

    public String getRepeatPassword() {
        return repeatPassword;
    }

    public String getPassword() {
        return password;
    }
}
