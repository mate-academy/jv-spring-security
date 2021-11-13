package mate.academy.spring.dto.request;

import javax.validation.constraints.NotNull;

public class MovieRequestDto {
    @NotNull(message = "please enter a movie title")
    private String movieTitle;
    @NotNull(message = "please enter a description")
    private String movieDescription;

    public String getMovieTitle() {
        return movieTitle;
    }

    public String getMovieDescription() {
        return movieDescription;
    }
}
