package mate.academy.spring.dto.request;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import mate.academy.spring.validation.EmailValidation;
import mate.academy.spring.validation.MatchFields;

@MatchFields(first = "password",
        second = "repeatPassword",
        message = "Passwords must be equal!")
public class UserRequestDto {
    @NotNull
    @EmailValidation
    private String email;
    @NotNull
    @Size(min = 5)
    private String password;

    @NotNull
    @Size(min = 5)
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
