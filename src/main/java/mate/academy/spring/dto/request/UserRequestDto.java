package mate.academy.spring.dto.request;

import javax.validation.constraints.Size;
import mate.academy.spring.validation.email.ValidEmail;
import mate.academy.spring.validation.password.ValidPassword;

@ValidPassword
public class UserRequestDto {
    @ValidEmail
    private String email;
    @Size(min = 4)
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
