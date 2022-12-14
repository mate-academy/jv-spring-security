package mate.academy.spring.dto.request;

import javax.validation.constraints.Size;

public class MovieRequestDto {
    @Size(min = 1)
    private String title;
    @Size(min = 5)
    private String description;

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
}
