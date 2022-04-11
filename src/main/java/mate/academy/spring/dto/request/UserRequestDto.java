package mate.academy.spring.dto.request;

import javax.validation.constraints.NotBlank;

public class UserRequestDto {
    private String email;
    @NotBlank
    private String password;

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
