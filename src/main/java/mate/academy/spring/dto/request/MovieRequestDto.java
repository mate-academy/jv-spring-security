package mate.academy.spring.dto.request;

import javax.validation.constraints.NotEmpty;

public class MovieRequestDto {
    @NotEmpty
    private String movieTitle;
    @NotEmpty
    private String movieDescription;

    public String getMovieTitle() {
        return movieTitle;
    }

    public String getMovieDescription() {
        return movieDescription;
    }
}
