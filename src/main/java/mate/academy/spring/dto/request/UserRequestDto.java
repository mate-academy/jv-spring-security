package mate.academy.spring.dto.request;

import javax.validation.constraints.Size;
import lombok.Getter;
import mate.academy.spring.validation.Email;
import mate.academy.spring.validation.Password;

@Getter
@Password(message = "password are not equal")
public class UserRequestDto {
    @Email
    private String email;
    @Size(min = 6, max = 32)
    private String password;
    private String repeatPassword;
}
