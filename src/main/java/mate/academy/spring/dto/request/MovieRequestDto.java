package mate.academy.spring.dto.request;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

public class MovieRequestDto {
    @NotEmpty
    @NotBlank
    private String title;
    @NotEmpty
    @NotBlank
    private String description;

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
}
