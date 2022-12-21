package mate.academy.spring.dto.request;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import lombok.Getter;
import mate.academy.spring.validation.ValidEmail;

@Getter
public class UserRequestDto {
    @ValidEmail
    private String email;
    @NotEmpty
    @Size(min = 4, max = 30)
    private String password;
    @NotEmpty
    @Size(min = 4, max = 30)
    private String repeatPassword;
}
