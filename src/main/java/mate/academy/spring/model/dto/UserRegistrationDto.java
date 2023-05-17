package mate.academy.spring.model.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import mate.academy.spring.validation.Email;

public class UserRegistrationDto {
    @Email
    private String email;
    @NotNull
    @Min(value = 3)
    private String name;
    @NotNull
    @Min(value = 5)
    private String password;
    @NotNull
    private String repeatPassword;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRepeatPassword() {
        return repeatPassword;
    }

    public void setRepeatPassword(String repeatPassword) {
        this.repeatPassword = repeatPassword;
    }
}
