package mate.academy.spring.dto.request;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class MovieSessionRequestDto {
    @NotNull
    @Min(value = 0)
    private Long movieId;
    @NotNull
    @Min(value = 0)
    private Long cinemaHallId;
    @NotNull
    @Size(min = 14)
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
