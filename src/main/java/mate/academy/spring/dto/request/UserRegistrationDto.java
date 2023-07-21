package mate.academy.spring.dto.request;

import mate.academy.spring.validator.Email;
import mate.academy.spring.validator.RepeatPassword;

import javax.validation.constraints.Min;

@RepeatPassword
public class UserRegistrationDto {
    @Email
    private String email;
    @Min(8)
    private String password;
    private String repeatPassword;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
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
