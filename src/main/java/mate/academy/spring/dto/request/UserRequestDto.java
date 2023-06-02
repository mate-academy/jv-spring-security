package mate.academy.spring.dto.request;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import mate.academy.spring.validation.ValidPassword;

@ValidPassword
public class UserRequestDto {

    @Email
    @NotEmpty
    private String email;
    @NotEmpty
    private String password;
    @NotEmpty
    private String repeatpassword;

    public UserRequestDto() {
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getRepeatpassword() {
        return repeatpassword;
    }
}
