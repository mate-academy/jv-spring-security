package mate.academy.spring.dto.request;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class MovieRequestDto {

    @NotNull
    @Size(min = 1, max = 100)
    private String title;
    @NotNull
    @Size(min = 10, max = 1000)
    private String description;

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
}
