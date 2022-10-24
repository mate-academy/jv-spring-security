package mate.academy.spring.dto.request;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class MovieRequestDto {
    @NotEmpty(message = "Title movie must not be empty")
    @Size(min = 1, message = "Title movie must be longer than 1 character")
    private String title;
    @NotEmpty(message = "Description movie must not de empty")
    @Size(min = 10, message = "Description movie must be longer than 10 character")
    private String description;

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
}
