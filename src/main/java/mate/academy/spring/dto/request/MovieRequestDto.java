package mate.academy.spring.dto.request;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class MovieRequestDto {
    @NotNull(message = "Please enter title")
    @Size(min = 5, max = 10, message = "Title size must be min=5 and max=10")
    private String title;
    @NotNull(message = "Please enter description")
    @Size(min = 5, max = 10, message = "Description size must be min=5 and max=10")
    private String description;

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
}
