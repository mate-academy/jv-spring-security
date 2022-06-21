package mate.academy.spring.dto.request;

import mate.academy.spring.validation.Email;
import javax.validation.constraints.Size;

public class UserRequestDto {
    @Email
    private String email;
    @Size(min = 8)
    private String password;

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
