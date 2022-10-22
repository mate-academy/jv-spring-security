package mate.academy.spring.dto.request;

import com.sun.istack.NotNull;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

public class UserRequestDto {
    @NotNull
    @Email
    @Size(min = 6)
    private String email;
    @NotNull
    @Size(min = 8, max = 16)
    private String password;

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
