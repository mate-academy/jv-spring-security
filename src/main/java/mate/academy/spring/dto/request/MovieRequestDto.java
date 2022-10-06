package mate.academy.spring.dto.request;

import javax.validation.constraints.NotEmpty;
import org.hibernate.validator.constraints.Length;

public class MovieRequestDto {
    @NotEmpty
    private String title;
    @Length(max=255, message = "The Description should be < 255 characters.")
    private String description;

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
}
