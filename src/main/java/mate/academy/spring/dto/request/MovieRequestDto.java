package mate.academy.spring.dto.request;

import jakarta.validation.constraints.Size;
import org.springframework.lang.NonNull;

public class MovieRequestDto {
    @NonNull
    @Size(min = 2, max = 20)
    private String movieTitle;
    @NonNull
    @Size(min = 2, max = 200)
    private String movieDescription;

    public String getMovieTitle() {
        return movieTitle;
    }

    public String getMovieDescription() {
        return movieDescription;
    }
}
