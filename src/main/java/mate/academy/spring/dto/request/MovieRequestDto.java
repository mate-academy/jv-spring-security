package mate.academy.spring.dto.request;

import javax.validation.constraints.Size;
import org.springframework.lang.NonNull;

public class MovieRequestDto {
    @NonNull
    @Size(max = 100)
    private String title;
    @Size(max = 500)
    private String description;

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
}
