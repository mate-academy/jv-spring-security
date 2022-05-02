package mate.academy.spring.dto.request;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import mate.academy.spring.validation.ValidPassword;

@ValidPassword
public class UserRequestDto {
    @Email
    private String email;
    @NotBlank
    @Min(8)
    private String password;
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
