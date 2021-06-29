package mate.academy.spring.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import mate.academy.spring.validation.Email;

public class UserRequestDto {
    private static final int MIN_PASSWORD_LENGTH = 4;
    @Email
    private String email;
    @NotBlank
    @Size(min = MIN_PASSWORD_LENGTH)
    private String password;

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
