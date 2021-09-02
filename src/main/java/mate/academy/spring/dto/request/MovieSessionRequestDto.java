package mate.academy.spring.dto.request;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class MovieSessionRequestDto {
    @NotNull
    @Min(1L)
    private Long movieId;
    @NotNull
    @Min(1L)
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
