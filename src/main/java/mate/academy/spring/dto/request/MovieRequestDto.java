package mate.academy.spring.dto.request;

import jakarta.validation.constraints.NotNull;

public class MovieRequestDto {
    @NotNull
    private String title;
    @NotNull(message = "Please add description")
    private String description;

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
}
