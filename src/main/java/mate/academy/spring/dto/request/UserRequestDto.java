package mate.academy.spring.dto.request;

import mate.academy.spring.validation.Email;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class UserRequestDto {
    @Email
    private String email;
    @NotBlank
    @Size(min = 8, max = 32)
    private String password;

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
