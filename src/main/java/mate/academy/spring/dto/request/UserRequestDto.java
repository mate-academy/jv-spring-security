package mate.academy.spring.dto.request;

import javax.validation.constraints.Size;
import mate.academy.spring.validator.Email;
import mate.academy.spring.validator.PasswordRepeated;

@PasswordRepeated
public class UserRequestDto {
    @Email
    private String email;
    @Size(min = 4, max = 255)
    private String password;

    @Size(min = 4, max = 255)
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
