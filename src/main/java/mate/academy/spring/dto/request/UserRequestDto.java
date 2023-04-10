package mate.academy.spring.dto.request;

import mate.academy.spring.validation.Email;
import mate.academy.spring.validation.PasswordMatches;
import org.hibernate.validator.constraints.Length;

@PasswordMatches
public class UserRequestDto {
    @Email
    @Length(min = 4, max = 8, message =
            "Email must be between 4 and 8 characters")
    private String email;
    @Length(min = 6, max = 12, message =
            "Password must be between 6 and 12 characters")
    private String password;
    @Length(min = 6, max = 12, message =
            "re-entering the password must match the entered password")
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
