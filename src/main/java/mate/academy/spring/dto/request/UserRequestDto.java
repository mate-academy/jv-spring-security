package mate.academy.spring.dto.request;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import mate.academy.spring.validation.FieldsValueMatch;

@FieldsValueMatch.List({
        @FieldsValueMatch(
                message = "Passwords should be equal",
                field = "password",
                fieldMatch = "repeatPassword"
        )
})
public class UserRequestDto {
    @Email
    private String email;
    @NotNull
    @Size(min = 8, max = 30)
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
