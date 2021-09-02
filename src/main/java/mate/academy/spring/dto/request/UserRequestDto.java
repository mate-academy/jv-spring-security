package mate.academy.spring.dto.request;

import javax.validation.constraints.Size;
import lombok.Getter;
import mate.academy.spring.validation.Email;
import mate.academy.spring.validation.RepeatablePassword;

@RepeatablePassword
@Getter
public class UserRequestDto {
    @Email
    private String email;
    @Size(min = 4, max = 25)
    private String password;
    private String repeatPassword;
}
