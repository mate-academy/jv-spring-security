package mate.academy.spring.dto.request;

import lombok.Data;
import mate.academy.spring.validation.Email;
import mate.academy.spring.validation.Password;

@Data
public class UserRequestDto {
    @Email
    private String email;
    @Password
    private String password;
    @Password
    private String repeatedPassword;
}
