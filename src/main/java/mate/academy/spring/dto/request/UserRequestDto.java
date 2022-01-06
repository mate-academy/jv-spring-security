package mate.academy.spring.dto.request;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import mate.academy.spring.validation.Email;
import mate.academy.spring.validation.ValidPassword;

@ValidPassword
public class UserRequestDto {
    @Email
    private String email;
    @Size(min = 8, max = 30)
    @Pattern(regexp = "^\\w*(([A-Z]+\\w*\\d+)|(\\d+\\w*[A-Z]+))\\w*$")
    private String password;
    @NotNull
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
