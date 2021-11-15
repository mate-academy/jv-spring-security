package mate.academy.spring.dto.request;

import javax.validation.constraints.Min;
import mate.academy.spring.validator.Email;
import mate.academy.spring.validator.PasswordMatch;

@PasswordMatch
public class UserRequestDto {
    @Email
    private String email;
    @Min(value = 6)
    private String password;
    @Min(value = 6)
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
