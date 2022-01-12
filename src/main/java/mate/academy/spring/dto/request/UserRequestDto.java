package mate.academy.spring.dto.request;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import lombok.Getter;
import mate.academy.spring.validation.Email;
import mate.academy.spring.validation.ValidPassword;

@Getter
@ValidPassword(message = "Passwords must be the same")
public class UserRequestDto {
    @Email
    @NotNull(message = "Email may not be empty")
    private String email;
    @NotNull(message = "Password may not be empty")
    @Pattern(regexp =
            "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!-/:-@\\[-`{-~]).{8,32}$",
            message = "Password must contain:\n"
                    + "a minimum of 1 numeric character (0-9) and\n"
                    + "a minimum of 1 upper case letter (A-Z) and\n"
                    + "a minimum of 1 lower case letter (a-z) and\n"
                    + "a minimum of 1 special character: ~`!@#$%^&*()-_+={}[]|\\;:\"<>,./?\n"
                    + "password is 8-16 characters with no space")
    private String password;
    private String repeatPassword;
}
