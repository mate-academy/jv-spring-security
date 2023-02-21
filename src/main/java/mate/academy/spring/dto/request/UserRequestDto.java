package mate.academy.spring.dto.request;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import mate.academy.spring.validation.Email;

public class UserRequestDto {
    private static final byte MIN_PASSWORD_LENGTH = 5;
    @Email
    private String email;
    @NotEmpty(message = "Please provide a password")
    @Size(min = MIN_PASSWORD_LENGTH, message = "The password length is less than "
            + MIN_PASSWORD_LENGTH)
    private String password;
    @NotEmpty(message = "Please provide a repeatPassword")
    @Size(min = MIN_PASSWORD_LENGTH, message = "The password length is less than "
            + MIN_PASSWORD_LENGTH)
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
