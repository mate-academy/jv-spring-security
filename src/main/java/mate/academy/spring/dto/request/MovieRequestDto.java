package mate.academy.spring.dto.request;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class MovieRequestDto {
    @NotNull
    @NotBlank
    private String title;
    @NotNull
    @NotBlank
    private String description;

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
}
