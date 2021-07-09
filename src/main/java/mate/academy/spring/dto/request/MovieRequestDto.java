package mate.academy.spring.dto.request;

import javax.validation.constraints.NotBlank;

public class MovieRequestDto {
    @NotBlank
    private String movieTitle;
    private String movieDescription;

    public String getMovieTitle() {
        return movieTitle;
    }

    public String getMovieDescription() {
        return movieDescription;
    }
}
