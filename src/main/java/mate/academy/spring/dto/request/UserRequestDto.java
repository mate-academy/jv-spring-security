package mate.academy.spring.dto.request;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import mate.academy.spring.validation.Email;
import mate.academy.spring.validation.FieldMatch;

@FieldMatch(first = "password", second = "confirmPassword", message = "Password are not equal")
public class UserRequestDto {
    @Email
    @NotNull
    private String email;
    @NotNull
    @Size(min = 5, max = 25)
    private String password;
    private String secondPassword;

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
