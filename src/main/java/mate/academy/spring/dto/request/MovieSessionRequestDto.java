package mate.academy.spring.dto.request;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class MovieSessionRequestDto {
    @Min(0)
    private Long movieId;
    @Min(0)
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
