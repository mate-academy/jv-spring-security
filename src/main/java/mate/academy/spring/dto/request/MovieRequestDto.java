package mate.academy.spring.dto.request;

import javax.validation.constraints.Size;
import org.springframework.lang.NonNull;

public class MovieRequestDto {
    @NonNull
    private String title;
    @NonNull
    @Size(min = 100)
    private String description;

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
}
