package mate.academy.spring.dto.response;

import javax.validation.constraints.NotNull;
import mate.academy.spring.model.validation.Email;

public class UserResponseDto {
    @NotNull
    private Long id;
    @Email
    private String email;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
