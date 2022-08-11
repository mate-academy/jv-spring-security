package mate.academy.spring.dto.request;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class UserRequestDto {
    @Email
    private String email;
    @NotNull
    @Min(8)
    private String password;

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
