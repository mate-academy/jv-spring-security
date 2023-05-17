package mate.academy.spring.dto.request;

import java.util.Objects;
import javax.validation.constraints.Size;
import mate.academy.spring.validation.Email;
import mate.academy.spring.validation.FieldMatch;

@FieldMatch(field = "password")
public class UserRequestDto {
    @Email
    private String email;
    @Size(min = 4)
    private String password;
    @Size(min = 4)
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
        return Objects.equals(email, that.email) && Objects.equals(password, that.password)
                && Objects.equals(repeatPassword, that.repeatPassword);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email, password, repeatPassword);
    }
}
