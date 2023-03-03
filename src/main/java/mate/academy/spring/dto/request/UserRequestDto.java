package mate.academy.spring.dto.request;

import mate.academy.spring.validation.Email;

import javax.validation.constraints.NotNull;

public class UserRequestDto {
    @Email
    private String email;
    @NotNull
    private String password;

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
