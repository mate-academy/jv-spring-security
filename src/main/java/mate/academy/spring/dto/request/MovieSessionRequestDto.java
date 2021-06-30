package mate.academy.spring.dto.request;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.PositiveOrZero;

public class MovieSessionRequestDto {
    @PositiveOrZero(message = " Movie id should be 0 or greater")
    private Long movieId;
    @PositiveOrZero(message = "Cinema hall id should be 0 or greater")
    private Long cinemaHallId;
    @NotEmpty
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
