package mate.academy.spring.dto.request;

import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

public class UserRequestDto {
    @Email
    @Size(min = 6,max = 50)
    private String email;
    @Size(min = 2,max = 24)
    private String password;

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
