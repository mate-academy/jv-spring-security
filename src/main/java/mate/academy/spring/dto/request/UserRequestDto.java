package mate.academy.spring.dto.request;

import javax.validation.constraints.Min;
import mate.academy.spring.validation.Email;
import mate.academy.spring.validation.Passwords;

@Passwords
public class UserRequestDto {
    @Email
    private String email;
    @Min(value = 4, message = "Invalid password length, minimum should be 4")
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
