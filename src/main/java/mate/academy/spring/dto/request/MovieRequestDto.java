package mate.academy.spring.dto.request;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class MovieRequestDto {
    @NotBlank
    @Size(min = 1)
    private String movieTitle;
    @NotBlank
    @Size(min = 16)
    private String movieDescription;

    public String getMovieTitle() {
        return movieTitle;
    }

    public String getMovieDescription() {
        return movieDescription;
    }
}
