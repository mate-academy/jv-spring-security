package mate.academy.spring.dto.request;

import org.springframework.lang.NonNull;

public class MovieRequestDto {

    @NonNull
    private String title;
    private String description;

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
}
