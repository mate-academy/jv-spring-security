package mate.academy.spring.dto.request;

import com.sun.istack.NotNull;
import javax.validation.constraints.Size;
import mate.academy.spring.validator.Email;

public class UserRequestDto {
    @Email
    private String email;
    @NotNull
    @Size(min = 6, max = 18)
    private String password;

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
