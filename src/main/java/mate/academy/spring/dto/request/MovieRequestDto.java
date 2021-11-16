package mate.academy.spring.dto.request;

import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;

public class MovieRequestDto {
    @NotNull
    private String movieTitle;
    @NotNull
    @Length(min = 10, max = 255)
    private String movieDescription;

    public String getMovieTitle() {
        return movieTitle;
    }

    public String getMovieDescription() {
        return movieDescription;
    }
}
