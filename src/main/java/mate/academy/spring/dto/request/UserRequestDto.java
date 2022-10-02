package mate.academy.spring.dto.request;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import mate.academy.spring.validation.Password;

@Password
public class UserRequestDto {
    @Email
    private String email;
    @NotNull
    @Size(min = 5, max = 20)
    private String password;
    @NotNull
    @Size(min = 5, max = 20)
    private String repeatedPassword;

    public String getRepeatedPassword() {
        return repeatedPassword;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
