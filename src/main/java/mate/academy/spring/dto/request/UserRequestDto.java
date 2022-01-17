package mate.academy.spring.dto.request;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;
import mate.academy.spring.validation.Email;
import mate.academy.spring.validation.MatchingPasswords;

@Getter
@MatchingPasswords(message = "passwords are not equal")
public class UserRequestDto {
    @Email
    private String email;
    @NotNull
    @Size(min = 6, max = 30)
    private String password;
    @NotNull
    @Size(min = 6, max = 30)
    private String repeatPassword;
}
