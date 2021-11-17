package mate.academy.spring.dto.request;

import mate.academy.spring.validation.Email;
import org.hibernate.validator.constraints.Length;

public class UserRequestDto {
    @Email
    private String email;
    @Length(min = 8)
    private String password;

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
