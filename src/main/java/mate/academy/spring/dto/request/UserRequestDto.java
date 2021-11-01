package mate.academy.spring.dto.request;

import mate.academy.spring.service.Email;
import mate.academy.spring.service.RepeatedPassword;

@RepeatedPassword
public class UserRequestDto {
    @Email
    private String email;
    private String password;
    private String twinPassword;

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

    public String getTwinPassword() {
        return twinPassword;
    }

    public void setTwinPassword(String twinPassword) {
        this.twinPassword = twinPassword;
    }
}
