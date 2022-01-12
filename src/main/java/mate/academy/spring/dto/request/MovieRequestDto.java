package mate.academy.spring.dto.request;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class MovieRequestDto {
    @NotNull
    @Size(min = 3, max = 150)
    private String movieTitle;
    @NotNull
    @Size(min = 3, max = 200)
    private String movieDescription;

    public String getMovieTitle() {
        return movieTitle;
    }

    public String getMovieDescription() {
        return movieDescription;
    }
}
