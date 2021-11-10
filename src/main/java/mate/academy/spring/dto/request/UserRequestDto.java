package mate.academy.spring.dto.request;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import mate.academy.spring.validation.ConfirmPassword;
import mate.academy.spring.validation.Email;

@ConfirmPassword
public class UserRequestDto {
    @Email
    @NotBlank
    private String email;
    @NotBlank
    @Min(value = 5)
    private String password;
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

    public void setRepeatPassword(String repeatPassword) {
        this.repeatPassword = repeatPassword;
    }
}
