package mate.academy.spring.dto.request;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;

public class MovieRequestDto {
    @NotNull
    @Max(50)
    private String title;
    private String description;

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
}
