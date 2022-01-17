package mate.academy.spring.dto.request;

import lombok.Getter;
import mate.academy.spring.validation.Email;
import mate.academy.spring.validation.ValidPassword;

@Getter
@ValidPassword
public class UserRequestDto {
    @Email
    private String email;
    private String password;
    private String repeatPassword;
}
