package mate.academy.spring.dto.request;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class MovieRequestDto {
    @NotNull
    @NotEmpty
    @Size(min = 1, max = 60)
    private String title;
    @NotNull
    @Size(min = 8, max = 200)
    private String description;

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
}
