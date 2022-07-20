package mate.academy.spring.dto.request;

import javax.validation.constraints.Size;
import mate.academy.spring.validation.Email;
import mate.academy.spring.validation.Password;

@Password
public class UserRequestDto {
    @Email
    private String email;
    @Size(min = 8, max = 15, message = "The password must be longer than 8 characters")
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

        if (email != null ? !email.equals(that.email) : that.email != null) {
            return false;
        }
        if (password != null ? !password.equals(that.password) : that.password != null) {
            return false;
        }
        return repeatPassword != null ? repeatPassword.equals(that.repeatPassword)
                : that.repeatPassword == null;
    }

    @Override
    public int hashCode() {
        int result = email != null ? email.hashCode() : 0;
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (repeatPassword != null ? repeatPassword.hashCode() : 0);
        return result;
    }
}
