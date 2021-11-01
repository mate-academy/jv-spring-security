package mate.academy.spring.dto.request;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class MovieRequestDto {
    @NotEmpty
    @Size(min = 6, max = 70)
    private String movieTitle;
    @NotEmpty
    @Size(min = 10, max = 250)
    private String movieDescription;

    public String getMovieTitle() {
        return movieTitle;
    }

    public String getMovieDescription() {
        return movieDescription;
    }
}
