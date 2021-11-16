package mate.academy.spring.dto.request;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

public class MovieSessionRequestDto {
    @Positive
    private Long movieId;
    @Positive
    private Long cinemaHallId;
    @NotNull
    @Size(min = 10)
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
