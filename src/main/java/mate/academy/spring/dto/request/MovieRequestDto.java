package mate.academy.spring.dto.request;

import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;

public class MovieRequestDto {
    @NotNull
    private String title;
    @Length(max = 255)
    private String description;

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
}
