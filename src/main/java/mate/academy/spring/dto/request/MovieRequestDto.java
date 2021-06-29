package mate.academy.spring.dto.request;

import com.sun.istack.NotNull;

public class MovieRequestDto {
    @NotNull
    private String movieTitle;
    @NotNull
    private String movieDescription;

    public String getMovieTitle() {
        return movieTitle;
    }

    public String getMovieDescription() {
        return movieDescription;
    }
}
