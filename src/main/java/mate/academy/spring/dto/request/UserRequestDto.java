package mate.academy.spring.dto.request;

import mate.academy.spring.validation.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

public class UserRequestDto {
    @Email
    private String email;
    @Min(value = 8)
    @Max(value = 64)
    private String password;

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
