package mate.academy.spring.dto.request;

import com.sun.istack.NotNull;
import mate.academy.spring.validator.Email;

public class UserRequestDto {
    @Email
    private String email;
    @NotNull
    private String password;

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
