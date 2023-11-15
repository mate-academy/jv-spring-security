package mate.academy.spring.dto.request;

import mate.academy.spring.validator.annotation.Email;
import mate.academy.spring.validator.annotation.Password;
import mate.academy.spring.validator.annotation.PasswordValidation;

@PasswordValidation
public class UserRequestDto {
    @Email
    private String email;
    @Password
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
