package mate.academy.spring.dto.request;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import mate.academy.spring.annotation.EmailConstraint;

public class UserRequestDto {
    @NotNull
    @EmailConstraint
    private String email;

    @NotNull
    @Min(6)
    private String password;

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
