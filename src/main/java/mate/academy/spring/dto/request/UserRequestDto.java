package mate.academy.spring.dto.request;

import javax.validation.constraints.Size;
import mate.academy.spring.validation.Email;
import mate.academy.spring.validation.ValidPassword;

@ValidPassword
public class UserRequestDto {
    @Email
    @Size(max = 320)
    private String email;
    @Size(max = 100)
    private String password;
    @Size(max = 100)
    private String repeatedPassword;

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getRepeatedPassword() {
        return repeatedPassword;
    }
}
