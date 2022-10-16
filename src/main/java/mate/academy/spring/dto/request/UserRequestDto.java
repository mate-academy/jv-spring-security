package mate.academy.spring.dto.request;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import mate.academy.spring.validation.Email;

@Getter
@Setter
public class UserRequestDto {
    @NotNull(message = "User email can't be empty")
    @Email(message = "User email is wrong")
    private String email;

    @NotNull(message = "User password can't be empty")
    @Size(min = 6, message = "password must be more than 6")
    private String password;
}
