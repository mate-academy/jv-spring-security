package mate.academy.spring.dto.request;

import javax.validation.constraints.Min;
import mate.academy.spring.validation.Email;
import mate.academy.spring.validation.PasswordAtRegistration;

@PasswordAtRegistration
public class UserRequestDto {
    @Email
    private String email;
    @Min(value = 8)
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
