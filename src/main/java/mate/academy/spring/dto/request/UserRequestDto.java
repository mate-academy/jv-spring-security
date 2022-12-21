package mate.academy.spring.dto.request;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import lombok.Getter;
import mate.academy.spring.validation.Email;

@Getter
public class UserRequestDto {
    @Email
    private String email;
    @NotEmpty
    @Size(min = 4, max = 30)
    private String password;
    @NotEmpty
    @Size(min = 4, max = 30)
    private String repeatPassword;
}
