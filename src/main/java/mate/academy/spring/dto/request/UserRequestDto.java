package mate.academy.spring.dto.request;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import mate.academy.spring.validation.Email;
import mate.academy.spring.validation.RepeatablePassword;

@RepeatablePassword
public class UserRequestDto {
    @Email
    private String email;
    @NotBlank
    @Size(min = 4, max = 16)
    private String password;
    @NotBlank
    @Size(min = 4, max = 16)
    private String repeatPassword;

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getRepeatPassword() {
        return repeatPassword;
    }
}
