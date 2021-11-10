package mate.academy.spring.dto.request;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

public class MovieRequestDto {
    @NotBlank
    private String movieTitle;
    @Min(value = 10)
    private String movieDescription;

    public String getMovieTitle() {
        return movieTitle;
    }

    public String getMovieDescription() {
        return movieDescription;
    }
}
