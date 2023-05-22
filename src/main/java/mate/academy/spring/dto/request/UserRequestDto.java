package mate.academy.spring.dto.request;

import java.util.Objects;
import javax.validation.constraints.Size;
import mate.academy.spring.validation.Email;
import mate.academy.spring.validation.Password;

@Password
public class UserRequestDto {
    @Email
    private String email;
    private String password;
    @Size(min = 8, max = 255)
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
    public int hashCode() {
        int result = 17;
        result = 31 * result + email.hashCode();
        result = 31 * result + password.hashCode();
        result = 31 * result + repeatPassword.hashCode();
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UserRequestDto that = (UserRequestDto) obj;
        return Objects.equals(email, that.email) && Objects.equals(password, that.password)
                && Objects.equals(repeatPassword, that.repeatPassword);
    }
}
