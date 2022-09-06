package mate.academy.spring.dto.request;

import javax.validation.constraints.NotNull;
import mate.academy.spring.validation.Email;
import mate.academy.spring.validation.Password;
import org.hibernate.validator.constraints.Length;

@Password
public class UserRequestDto {
    @Email
    private String email;
    @NotNull
    @Length(min = 4)
    private String password;
    @NotNull
    @Length(min = 4)
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
