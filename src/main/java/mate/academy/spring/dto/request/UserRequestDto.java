package mate.academy.spring.dto.request;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class UserRequestDto {
    @NotNull
    private String email;
    @NotNull
    @Size(min = 6)
    private String password;

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
