package mate.academy.spring.dto.request;

import java.util.Objects;
import javax.validation.Valid;
import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import mate.academy.spring.model.validation.Email;

public class UserRequestDto {
    @Email
    @NotNull
    @NotBlank
    private String email;
    @NotNull
    @NotBlank
    private String password;
    @NotNull
    @NotBlank
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

    @Valid
    @AssertTrue(message = "passwords do not match")
    public boolean getPasswordsMatch() {
        return Objects.equals(password, repeatPassword);
    }
}
