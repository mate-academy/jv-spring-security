package mate.academy.spring.dto.request;

import javax.validation.constraints.Min;
import mate.academy.spring.validation.Email;

public class UserRequestDto {
    @Email
    private String email;
    @Min(value = 4)
    private String password;

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
