package mate.academy.spring.dto.request;

import javax.validation.constraints.NotNull;

public class MovieRequestDto {
    @NotNull
    private String title;

    @NotNull
    private String description;

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
}
