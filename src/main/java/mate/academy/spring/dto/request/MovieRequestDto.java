package mate.academy.spring.dto.request;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class MovieRequestDto {
    @Size(max = 50)
    @NotNull
    private String title;
    @Size(max = 1000)
    @NotNull
    private String description;

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
}
