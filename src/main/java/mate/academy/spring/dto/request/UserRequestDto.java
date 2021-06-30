package mate.academy.spring.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;

public class UserRequestDto {
    private static final int MIN_SIZE_FOR_PASSWORD = 4;
    @Email
    private String email;
    @Size(min = MIN_SIZE_FOR_PASSWORD)
    private String password;

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
