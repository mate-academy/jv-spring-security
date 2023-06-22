package mate.academy.spring.dto.response;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class MovieResponseDto {
    @NotNull
    private Long movieId;
    @NotBlank
    @NotNull
    private String movieTitle;
    @NotNull
    @NotBlank
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
