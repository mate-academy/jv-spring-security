package mate.academy.spring.dto.request;

import java.util.Objects;
import mate.academy.spring.validation.Email;
import mate.academy.spring.validation.ValidPassword;

@ValidPassword
public class UserRequestDto {
    @Email
    private String email;
    private String password;
    private String repeatPassword;

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getRepeatedPassword() {
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
        UserRequestDto userRequestDto = (UserRequestDto) o;
        return Objects.equals(password, userRequestDto.password) && Objects.equals(repeatPassword,
                userRequestDto.repeatPassword);
    }

    @Override
    public int hashCode() {
        return Objects.hash(password, repeatPassword);
    }
}
