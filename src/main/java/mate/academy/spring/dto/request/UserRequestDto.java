package mate.academy.spring.dto.request;

import javax.validation.constraints.Size;
import mate.academy.spring.annotation.Email;
import mate.academy.spring.annotation.PasswordValidation;

@PasswordValidation(message = "the passwords aren't same")
public class UserRequestDto {
    @Email(message = "please enter valid email")
    private String email;

    @Size(min = 8, message = "the password must be longer than eight characters")
    private String password;

    @Size(min = 8, message = "the repeat password must be longer than eight characters")
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
