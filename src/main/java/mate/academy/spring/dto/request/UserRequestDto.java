package mate.academy.spring.dto.request;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import mate.academy.spring.util.Email;

public class UserRequestDto {
    @Email
    private String email;
    @NotBlank
    @Size(min = 6, max = 18)
    private String password;

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
