package mate.academy.spring.dto.request;

import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

public class UserRequestDto {
    @Email
    private String email;
    @Size(min = 4, max = 20)
    private String password;
    @Size(min = 4, max = 20)
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
