package mate.academy.spring.dto.request;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;

public class UserRequestDto {
    @Email
    private String email;
    @Min(value = 5)
    private String password;

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
