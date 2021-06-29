package mate.academy.spring.dto.request;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class MovieRequestDto {
    @NotNull
    @Max(value = 256)
    @Min(value = 1)
    private String movieTitle;
    @NotNull
    @Max(value = 256)
    private String movieDescription;

    public String getMovieTitle() {
        return movieTitle;
    }

    public String getMovieDescription() {
        return movieDescription;
    }
}
