package mate.academy.spring.dto.request;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;

public class MovieRequestDto {
    @Max(50)
    @NotNull
    private String title;
    @Max(1000)
    @NotNull
    private String description;

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
}
