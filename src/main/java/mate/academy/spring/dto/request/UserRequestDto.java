package mate.academy.spring.dto.request;

import javax.validation.constraints.Email;
import mate.academy.spring.validation.Same;

@Same
public class UserRequestDto {
    @Email
    private String email;
    private String password;
    private String rePassword;

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getRePassword() {
        return rePassword;
    }
}
