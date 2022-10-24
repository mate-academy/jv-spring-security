package mate.academy.spring.dto.request;

import javax.validation.constraints.Size;
import mate.academy.spring.validation.Email;
import org.springframework.lang.NonNull;

public class UserRequestDto {
    @Email
    private String email;
    @NonNull
    @Size(min = 4)
    private String password;

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
