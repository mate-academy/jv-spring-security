package mate.academy.spring.dto.request;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class MovieRequestDto {
    private static final int MIN_MOVIE_TITLE_LENGTH = 2;
    @NotNull
    @Size(min = MIN_MOVIE_TITLE_LENGTH)
    private String movieTitle;
    @NotNull
    private String movieDescription;

    public String getMovieTitle() {
        return movieTitle;
    }

    public String getMovieDescription() {
        return movieDescription;
    }
}
