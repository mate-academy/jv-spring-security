package mate.academy.spring.dto.request;

import javax.validation.constraints.Size;
import mate.academy.spring.validator.Email;
import mate.academy.spring.validator.RepeatPassword;

@RepeatPassword
public class UserRequestDto {
    @Email
    private String email;
    @Size(min = 8)
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
