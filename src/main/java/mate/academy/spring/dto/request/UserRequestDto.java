package mate.academy.spring.dto.request;

import lombok.Getter;
import mate.academy.spring.validation.ValidEmail;
import mate.academy.spring.validation.ValidPassword;

@Getter
@ValidPassword
public class UserRequestDto {
    @ValidEmail
    private String email;
    private String password;
    private String repeatPassword;
}
