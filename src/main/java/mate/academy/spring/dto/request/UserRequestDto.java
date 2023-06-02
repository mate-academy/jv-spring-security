package mate.academy.spring.dto.request;

import mate.academy.spring.validation.Email;
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

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRepeatPassword() {
        return repeatpassword;
    }

    public void setRepeatpassword(String repeatpassword) {
        this.repeatpassword = repeatpassword;
    }
}
