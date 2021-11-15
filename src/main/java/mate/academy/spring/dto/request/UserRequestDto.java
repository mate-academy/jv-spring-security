package mate.academy.spring.dto.request;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import mate.academy.spring.validation.EmailValidation;

public class UserRequestDto {
    @EmailValidation
    private String email;
    @NotNull
    @Size(min = 4,max = 21)
    private String password;

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
