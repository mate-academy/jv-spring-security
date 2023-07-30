package mate.academy.spring.dto.request;

import mate.academy.spring.validation.Email;
import mate.academy.spring.validation.MatchPassword;
import org.hibernate.validator.constraints.Length;

@MatchPassword
public class UserRequestDto {
    @Email
    private String email;
    @Length(min = 8, max = 32)
    private String password;
    @Length(min = 8, max = 32)
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
