package mate.academy.spring.dto.request;

import jakarta.validation.constraints.Min;

public class MovieRequestDto {
    @Min(value = 2)
    private String movieTitle;
    @Min(value = 2)
    private String movieDescription;

    public String getMovieTitle() {
        return movieTitle;
    }

    public String getMovieDescription() {
        return movieDescription;
    }
}
