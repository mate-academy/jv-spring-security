package mate.academy.spring.dto.request;

import javax.validation.constraints.PositiveOrZero;

public class MovieSessionRequestDto {
    @PositiveOrZero
    private Long movieId;
    @PositiveOrZero
    private Long cinemaHallId;
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
