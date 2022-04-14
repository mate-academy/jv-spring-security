package mate.academy.spring.dto.request;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class MovieRequestDto {
    @NotNull(message = "Title can't be null")
    @Size(min = 1, message = "Title must contain at least 1 character")
    private String title;
    @NotNull(message = "Description can't be null")
    @Size(min = 10, message = "Description must contain at least 10 characters")
    private String description;

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
}
