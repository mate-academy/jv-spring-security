package mate.academy.spring.dto.request;

import javax.validation.constraints.Min;

public class MovieRequestDto {
    @Min(1)
    private String title;
    @Min(4)
    private String description;

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
}
