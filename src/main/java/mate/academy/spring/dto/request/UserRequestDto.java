package mate.academy.spring.dto.request;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import mate.academy.spring.validation.Email;
import mate.academy.spring.validation.FieldsValueMatch;

@FieldsValueMatch(
        password = "password",
        repeatPassword = "repeatPassword",
        message = "Passwords do not match!"
)
public class UserRequestDto {
    @Email
    private String email;
    @NotNull
    @Size(min = 4)
    private String password;
    @Size(min = 4)
    private String repeatPassword;

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

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
