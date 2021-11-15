package mate.academy.spring.dto.request;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class MovieSessionRequestDto {
    @NotNull
    @Size(min = 1)
    private Long movieId;
    @NotNull
    @Size(min = 1)
    private Long cinemaHallId;
    @NotNull
    private String showTime;

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
