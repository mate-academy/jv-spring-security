package mate.academy.spring.dto.request;

import javax.validation.constraints.NotNull;

public class MovieRequestDto {
    @NotNull(message = "Please enter a movie title")
    private String title;
    @NotNull(message = "Please enter a movie description")
    private String description;

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
}
