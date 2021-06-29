package mate.academy.spring.dto.request;

import com.sun.istack.NotNull;
import javax.validation.constraints.NotEmpty;

public class MovieRequestDto {
    @NotNull
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
