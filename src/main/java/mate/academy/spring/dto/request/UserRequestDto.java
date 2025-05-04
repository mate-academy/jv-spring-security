package mate.academy.spring.dto.request;

import mate.academy.spring.validation.Email;
import org.hibernate.validator.constraints.Length;

public class UserRequestDto {
    @Email
    private String email;
    @Length(min = 8, max = 32)
    private String password;

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }
}
