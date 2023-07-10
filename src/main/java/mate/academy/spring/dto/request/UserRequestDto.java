package mate.academy.spring.dto.request;

import mate.academy.spring.validation.Email;
import mate.academy.spring.validation.Password;
import org.hibernate.validator.constraints.Length;

@Password
public class UserRequestDto {
    @Email
    private String email;
    @Length(min = 8, max = 16)
    private String password;
    @Length(min = 8, max = 16)
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
