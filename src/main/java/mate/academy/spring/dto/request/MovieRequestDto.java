package mate.academy.spring.dto.request;

import javax.validation.constraints.NotBlank;

public class MovieRequestDto {
    @NotBlank(message = "Title may not be blank")
    private String title;
    @NotBlank(message = "Description may not be blank")
    private String description;

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
}
