package mate.academy.spring.dto.request;

import mate.academy.spring.validation.Password;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class UserRequestDto {
    @NotNull
    @Email
    private String email;
    @NotNull
    @Size(min = 4)
    @Password
    private String password;

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
