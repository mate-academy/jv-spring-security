package mate.academy.spring.dto.request;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import mate.academy.spring.validation.Email;

public class UserRequestDto {
    @NotNull
    @Email
    private String email;
    @Min(value = 8)
    private String password;

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
