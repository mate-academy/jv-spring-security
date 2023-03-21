package mate.academy.spring.dto.request;

import mate.academy.spring.annotation.Email;
import mate.academy.spring.annotation.PasswordValidation;

@PasswordValidation(message = "the passwords aren't same")
public class UserRequestDto {
    @Email(message = "please enter valid email")
    private String email;

    private String password;

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
