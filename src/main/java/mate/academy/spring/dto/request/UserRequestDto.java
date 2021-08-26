package mate.academy.spring.dto.request;

import javax.validation.constraints.Size;
import mate.academy.spring.validate.Email;

public class UserRequestDto {
    @Email
    private String email;
    @Size(min = 5)
    private String password;

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
