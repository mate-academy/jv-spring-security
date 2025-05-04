package mate.academy.spring.dto.response;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class MovieResponseDto {
    @NotNull
    @Size(min = 1)
    private Long movieId;
    @NotNull
    private String movieTitle;
    private String movieDescription;

    public Long getMovieId() {
        return movieId;
    }

    public void setMovieId(Long movieId) {
        this.movieId = movieId;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public String getMovieDescription() {
        return movieDescription;
    }

    public void setMovieDescription(String movieDescription) {
        this.movieDescription = movieDescription;
    }
}
