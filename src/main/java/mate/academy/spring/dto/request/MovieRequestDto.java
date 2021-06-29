package mate.academy.spring.dto.request;

import javax.validation.constraints.Size;

public class MovieRequestDto {
    @Size(min = 1, max = 255)
    private String movieTitle;
    @Size(min = 5, max = 255)
    private String movieDescription;

    public String getMovieTitle() {
        return movieTitle;
    }

    public String getMovieDescription() {
        return movieDescription;
    }
}
