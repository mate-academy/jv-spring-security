package mate.academy.spring.dto.request;

import mate.academy.spring.validation.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class UserRequestDto {
    private static final byte MIN_PASSWORD_LENGTH = 5;
    @Email
    private String email;
    @NotNull
    @Size(min = MIN_PASSWORD_LENGTH)
    private String password;

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
