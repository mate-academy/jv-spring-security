package mate.academy.spring.dto.request;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class MovieRequestDto {
    @NotNull(message = "Please enter title")
    @Size(min = 1, message = "Title must be greater then 1")
    private String title;
    @NotNull(message = "Please enter description")
    @Size(min = 2, message = "Description must be greater then 2")
    private String description;

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
}
