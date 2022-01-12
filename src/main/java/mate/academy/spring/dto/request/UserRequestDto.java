package mate.academy.spring.dto.request;

import javax.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import mate.academy.spring.validation.Email;
import mate.academy.spring.validation.Password;

@Setter
@Getter
@Password
public class UserRequestDto {
    @Email
    @NotNull
    private String email;
    private String password;
    private String repeatPassword;
}
