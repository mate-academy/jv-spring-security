package mate.academy.spring.dto.request;

import javax.validation.constraints.Size;

public class MovieRequestDto {
    @Size(min = 1, message = "Movie title must be longer than 1 character")
    private String movieTitle;
    @Size(min = 3, max = 256, message = "Movie description must be between 3 and 256 characters")
    private String movieDescription;

    public String getMovieTitle() {
        return movieTitle;
    }

    public String getMovieDescription() {
        return movieDescription;
    }
}
