package mate.academy.spring.dto.request;

import java.time.LocalDateTime;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class MovieSessionRequestDto {
    @NotNull(message = "Please enter a movie id")
    @Min(value = 1)
    private Long movieId;
    @NotNull(message = "Please enter a cinema hall id")
    @Min(value = 1)
    private Long cinemaHallId;
    @NotNull(message = "Please enter a show time")
    private LocalDateTime showTime;

    public Long getMovieId() {
        return movieId;
    }

    public Long getCinemaHallId() {
        return cinemaHallId;
    }

    public LocalDateTime getShowTime() {
        return showTime;
    }
}
