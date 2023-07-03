package mate.academy.spring.dto.request;

import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;

public class MovieRequestDto {
    @NotNull
    @Length(min = 1, max = 100)
    private String title;
    @NotNull
    @Length(min = 10, max = 50)
    private String description;

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
}
