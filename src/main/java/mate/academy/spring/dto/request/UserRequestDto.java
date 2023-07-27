package mate.academy.spring.dto.request;

import javax.validation.constraints.Size;
import mate.academy.spring.validator.Email;
import mate.academy.spring.validator.Password;

@Password
public class UserRequestDto {
    @Email
    @Size(min = 8, max = 20)
    private String email;
    @Size(min = 8, max = 20)
    private String password;
    @Size(min = 8, max = 20)
    private String repeatPassword;

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRepeatPassword() {
        return repeatPassword;
    }

    public void setRepeatPassword(String repeatPassword) {
        this.repeatPassword = repeatPassword;
    }
}
