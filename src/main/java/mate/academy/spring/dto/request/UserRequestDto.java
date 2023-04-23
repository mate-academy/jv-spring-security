package mate.academy.spring.dto.request;

import mate.academy.spring.validation.Email;
import mate.academy.spring.validation.PasswordValidation;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@PasswordValidation
public class UserRequestDto {
    @Email
    private String email;
    @Size(min = 6, message = "Password must be greater then 2")
    private String password;
    @Size(min = 6, message = "Password must be greater then 2")
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
