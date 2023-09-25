package mate.academy.spring.dto.request;

import javax.validation.constraints.Size;

public class MovieRequestDto {
    @Size(min = 3)
    private String title;
    private String description;

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
}
