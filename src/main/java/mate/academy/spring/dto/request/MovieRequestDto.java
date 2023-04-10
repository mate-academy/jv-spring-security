package mate.academy.spring.dto.request;

import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;

public class MovieRequestDto {
    @NotNull
    @Length(min = 2, max = 20, message = "Provide the title of movie")
    private String title;
    @NotNull
    @Length(min = 10, max = 255, message = "Provide the description of movie")
    private String description;

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
}
