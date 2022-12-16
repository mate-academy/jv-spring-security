package mate.academy.spring.dto.request;

import javax.validation.constraints.Size;
import mate.academy.spring.validation.Email;
import mate.academy.spring.validation.Password;

@Password.List({
        @Password(first = "password", second = "repeatedPassword",
                message = "The password fields must match")
})
public class UserRequestDto {
    @Email
    private String email;
    @Size(min = 8, max = 25)
    private String password;
    @Size(min = 8, max = 25)
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
