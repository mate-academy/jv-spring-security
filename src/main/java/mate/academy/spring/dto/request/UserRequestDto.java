package mate.academy.spring.dto.request;

import mate.academy.spring.validation.Email;
import mate.academy.spring.validation.Password;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Password.List({
        @Password(first = "password", second = "repeatedPassword",
                message = "The password fields must match")
})
public class UserRequestDto {
    @Email
    private String email;
    @NotNull
    @Size(min = 8, max = 25)
    private String password;
    @NotNull
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
