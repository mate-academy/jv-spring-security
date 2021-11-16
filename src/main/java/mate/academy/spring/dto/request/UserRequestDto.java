package mate.academy.spring.dto.request;

import javax.validation.constraints.NotNull;
import mate.academy.spring.validation.Email;
import org.hibernate.validator.constraints.Length;

public class UserRequestDto {
    @NotNull
    @Email
    private String email;
    @NotNull
    @Length(min = 8)
    private String password;

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
