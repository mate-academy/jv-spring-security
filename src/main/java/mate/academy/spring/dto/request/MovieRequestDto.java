package mate.academy.spring.dto.request;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class MovieRequestDto {
    @NotNull
    @NotBlank(message = " field can't be empty")
    @Size(min = 1, max = 256)
    private String title;
    @NotNull
    @NotBlank(message = " field can't be empty")
    @Size(min = 1, max = 256)
    private String description;

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
}
