package mate.academy.spring.dto.request;

import javax.validation.constraints.NotNull;
import mate.academy.spring.validation.ValidEmail;
import mate.academy.spring.validation.ValidPassword;

public class UserRequestDto {
    @NotNull
    @ValidEmail
    private String email;
    @NotNull
    @ValidPassword
    private String password;

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
