package mate.academy.spring.dto.request;

import mate.academy.spring.validator.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class UserRequestDto {
    @Email
    private String email;
    @NotNull
    @Min(8)
    @Max(64)
    private String password;

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
