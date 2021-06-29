package mate.academy.spring.dto.request;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class MovieRequestDto {
    @NotEmpty(message = "Please provide a title")
    @Size(min = 1, max = 255)
    private String movieTitle;
    @Size(max = 255)
    private String movieDescription;

    public String getMovieTitle() {
        return movieTitle;
    }

    public String getMovieDescription() {
        return movieDescription;
    }
}
