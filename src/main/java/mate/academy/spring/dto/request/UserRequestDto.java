package mate.academy.spring.dto.request;

import javax.validation.constraints.Email;

public class UserRequestDto {
    private String email;
    private String password;

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
