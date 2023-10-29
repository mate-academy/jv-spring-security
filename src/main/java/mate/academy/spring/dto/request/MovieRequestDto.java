package mate.academy.spring.dto.request;

import javax.validation.constraints.NotBlank;

public class MovieRequestDto {
    @NotBlank
    private String title;
    private String description;

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
}
