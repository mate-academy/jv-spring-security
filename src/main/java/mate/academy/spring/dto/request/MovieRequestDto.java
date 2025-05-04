package mate.academy.spring.dto.request;

import javax.validation.constraints.Size;

public class MovieRequestDto {
    @Size(min = 2, max = 50)
    private String title;
    @Size(min = 10, max = 1000)
    private String description;

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
}
