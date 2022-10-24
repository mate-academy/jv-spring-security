package mate.academy.spring.dto.request;

import javax.validation.constraints.Size;
import mate.academy.spring.validation.Email;
import mate.academy.spring.validation.FieldsValueMatch;

@FieldsValueMatch(first = "password", second = "repeatPassword",
        message = "The password fields must match")
public class UserRequestDto {
    @Email
    private String email;
    @Size(min = 4)
    private String password;
    @Size(min = 4)
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
