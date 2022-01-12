package mate.academy.spring.dto.request;

import javax.validation.constraints.Size;
import mate.academy.spring.validator.Email;
import mate.academy.spring.validator.PasswordsMatch;

@PasswordsMatch
public class UserRequestDto {
    @Email
    private String email;
    @Size(min = 3, max = 20)
    private String password;
    @Size(min = 3, max = 20)
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

    public void setRepeatPassword(String repeatPassword) {
        this.repeatPassword = repeatPassword;
    }
}
