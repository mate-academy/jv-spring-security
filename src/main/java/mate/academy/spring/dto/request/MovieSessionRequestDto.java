package mate.academy.spring.dto.request;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

public class MovieSessionRequestDto {
    @NotNull
    @Min(1)
    private Long movieId;
    @NotNull
    @Min(1)
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
