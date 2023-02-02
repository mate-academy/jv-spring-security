package mate.academy.spring.dto.request;

import mate.academy.spring.validation.Email;
import mate.academy.spring.validation.ValidPassword;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Size;

@ValidPassword
public class UserRequestDto {
    @Email
    private String email;
    @Length(min = 8)
    private String password;
    @Length(min = 8)
    private String repeatedPassword;

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getRepeatedPassword() {
        return repeatedPassword;
    }
}
