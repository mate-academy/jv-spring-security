package mate.academy.spring.dto.request;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class MovieRequestDto {
    @NotNull
    @Min(value = 1)
    private String title;
    @NotNull
    @Min(value = 1)
    private String description;

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
}
