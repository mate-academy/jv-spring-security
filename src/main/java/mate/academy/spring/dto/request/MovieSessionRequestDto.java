package mate.academy.spring.dto.request;

import java.time.LocalDateTime;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class MovieSessionRequestDto {
    @Min(value = 1, message = "Movie id must be at least 1")
    private Long movieId;
    @Min(value = 1, message = "Cinema hall id must be at least 1")
    private Long cinemaHallId;
    @NotNull(message = "Show time can't be null")
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
