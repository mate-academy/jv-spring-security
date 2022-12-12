package mate.academy.spring.dto.request;

import javax.validation.constraints.Size;
import mate.academy.spring.validation.Email;
import mate.academy.spring.validation.RepeatedFields;

@RepeatedFields(field = "password",
        repeatField = "repeatPassword",
        message = "repeat password must match password")
public class UserRequestDto {
    @Email
    private String email;
    @Size(min = 6, max = 100)
    private String password;
    @Size(min = 6, max = 100)
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
