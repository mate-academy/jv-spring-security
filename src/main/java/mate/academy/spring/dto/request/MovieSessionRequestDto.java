package mate.academy.spring.dto.request;

import javax.validation.constraints.NotEmpty;

public class MovieSessionRequestDto {
    @NotEmpty
    private Long movieId;
    @NotEmpty
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
