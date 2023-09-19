package mate.academy.spring.dto.request;

import javax.validation.constraints.NotEmpty;

public class MovieRequestDto {
    @NotEmpty(message = "Please enter title")
    private String title;
    @NotEmpty(message = "Please enter description")
    private String description;

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
}
