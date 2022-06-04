package mate.academy.spring.dto.request;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import mate.academy.spring.validation.Email;

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
