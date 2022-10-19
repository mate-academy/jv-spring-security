package mate.academy.spring.dto.request;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import mate.academy.spring.validation.Email;
import mate.academy.spring.validation.FieldsValueMatch;

@FieldsValueMatch(first = "password", second = "repeatPassword")
public class UserRequestDto {

    @Email
    private String email;
    @Size(min = 6)
    private String password;
    @Size(min = 6)
    private String repeatPassword;

    public String getRepeatPassword() {
        return repeatPassword;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
