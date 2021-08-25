package mate.academy.spring.dto.request;

import javax.validation.constraints.NotNull;
import lombok.Getter;
import mate.academy.spring.validation.Email;

@Getter
public class UserRequestDto {
    @Email
    private String email;
    @NotNull
    private String password;
}
