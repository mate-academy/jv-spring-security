package mate.academy.spring.dto.request;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class MovieRequestDto {
    @NotBlank
    @Size(min = 3, max = 30)
    private String title;
    @NotBlank
    @Size(min = 30, max = 1000)
    private String description;

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
}
