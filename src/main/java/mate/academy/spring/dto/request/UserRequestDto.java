package mate.academy.spring.dto.request;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;
import mate.academy.spring.validator.Email;
import mate.academy.spring.validator.Password;

@Getter
@Password(message = "passwords are not equal")
public class UserRequestDto {
    @Email
    private String email;
    @NotNull
    @Size(min = 2, max = 30)
    private String password;
    @NotNull
    @Size(min = 2, max = 30)
    private String repeatPassword;
}
