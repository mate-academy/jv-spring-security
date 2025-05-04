package mate.academy.spring.dto.request;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;

@Getter
public class UserRequestDto {
    @NotNull
    @Email
    private String email;
    @NotNull
    @Size(min = 6)
    private String password;
}
