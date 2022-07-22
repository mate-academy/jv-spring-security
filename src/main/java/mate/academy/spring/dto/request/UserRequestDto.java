package mate.academy.spring.dto.request;

import java.util.Objects;
import javax.validation.constraints.Size;
import mate.academy.spring.validation.Email;
import mate.academy.spring.validation.Password;

@Password
public class UserRequestDto {
    @Email(message = "Email should be valid")
    private String email;
    @Size(min = 8, max = 15, message = "Password must be more than 8 characters and less than 15")
    private String password;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UserRequestDto that = (UserRequestDto) o;
        return Objects.equals(email, that.email)
                && Objects.equals(password, that.password)
                && Objects.equals(repeatPassword, that.repeatPassword);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email, password, repeatPassword);
    }
}
