package mate.academy.spring.dto.request;

import javax.validation.constraints.Size;
import mate.academy.spring.validation.ValidEmail;
import mate.academy.spring.validation.ValidPassword;

@ValidPassword
public class UserRequestDto {
    @ValidEmail
    private String email;
    @Size(min = 8, max = 32)
    private String password;
    @Size(min = 8, max = 32)
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
