package mate.academy.spring.dto.request;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class MovieRequestDto {
    @NotNull
    @Size(min = 10)
    private String movieTitle;
    @NotNull
    @Size(min = 10)
    private String movieDescription;

    public String getMovieTitle() {
        return movieTitle;
    }

    public String getMovieDescription() {
        return movieDescription;
    }
}
