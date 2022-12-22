package mate.academy.spring.dto.request;

import javax.validation.constraints.Size;
import mate.academy.spring.validation.ValidEmail;
import mate.academy.spring.validation.ValidPassword;

@ValidPassword
public class UserRequestDto {
    @ValidEmail
    private String email;
    @Size(min = 5, max = 10)
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
