package mate.academy.spring.dto.request;

import mate.academy.spring.validation.EmailValidation;
import mate.academy.spring.validation.PasswordValidation;

@PasswordValidation
public class UserRequestDto {
    @EmailValidation
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
