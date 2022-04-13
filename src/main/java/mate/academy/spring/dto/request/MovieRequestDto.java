package mate.academy.spring.dto.request;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class MovieRequestDto {
    @NotBlank
    private String title;
    @NotBlank
    @Size(max = 200)
    private String description;

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
}
