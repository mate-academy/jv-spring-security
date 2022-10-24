package mate.academy.spring.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class MovieRequestDto {
    @Size(min = 3, message = "Title length can not be less than 3")
    private String title;
    @NotBlank
    private String description;

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
}
