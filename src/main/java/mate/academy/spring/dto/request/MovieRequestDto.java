package mate.academy.spring.dto.request;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class MovieRequestDto {
    @NotEmpty(message = "Please provide a title")
    @Size(message = "The title length must be less than " + Integer.MAX_VALUE)
    private String title;
    @NotEmpty(message = "Please provide a description")
    @Size(message = "The description length must be less than " + Integer.MAX_VALUE)
    private String description;

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
}
