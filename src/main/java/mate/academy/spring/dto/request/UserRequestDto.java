package mate.academy.spring.dto.request;

import javax.validation.constraints.Email;
import mate.academy.spring.validation.ValidPassword;

@ValidPassword
public class UserRequestDto {

    @Email
    private String email;
    private String password;
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
