package mate.academy.spring.dto.request;

import javax.validation.constraints.NotNull;

public class MovieSessionRequestDto {
    private Long movieId;
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
