package mate.academy.spring.dto.response;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class UserResponseDto {
    @NotNull
    private Long id;
    @NotBlank @NotNull
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
