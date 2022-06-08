package mate.academy.spring.dto.request;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import mate.academy.spring.validate.FieldsValueEquals;

@FieldsValueEquals.List({
        @FieldsValueEquals(
                field = "password",
                equalsField = "repeatPassword",
                message = "password not equals!"
        )
})
public class UserRequestDto {
    @Email
    private String email;
    @NotNull
    private String password;
    @NotNull
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
