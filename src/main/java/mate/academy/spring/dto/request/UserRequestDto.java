package mate.academy.spring.dto.request;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import mate.academy.spring.validation.EmailConstraint;
import mate.academy.spring.validation.PasswordsEqualConstraint;

@PasswordsEqualConstraint
public class UserRequestDto {
    @EmailConstraint
    private String email;
    @NotBlank
    @Size(min = 3, max = 50)
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
