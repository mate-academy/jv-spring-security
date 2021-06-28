package mate.academy.spring.dto.request;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class MovieSessionRequestDto {
    @NotNull(message = "Please provide a movie")
    @Min(value = 0)
    private Long movieId;
    @NotEmpty(message = "Please provide a show time")
    private String showTime;
    @NotNull(message = "Please provide a cinema hall")
    @Min(value = 0)
    private Long cinemaHallId;

    public Long getMovieId() {
        return movieId;
    }

    public Long getCinemaHallId() {
        return cinemaHallId;
    }

    public String getShowTime() {
        return showTime;
    }
}
