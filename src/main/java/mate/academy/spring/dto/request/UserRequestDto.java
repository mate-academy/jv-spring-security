package mate.academy.spring.dto.request;

import mate.academy.spring.validation.Email;

public class UserRequestDto {
    @Email
    private String email;
    private String password;

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
