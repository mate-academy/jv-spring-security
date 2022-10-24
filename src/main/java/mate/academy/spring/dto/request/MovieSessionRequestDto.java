package mate.academy.spring.dto.request;

import java.time.LocalDateTime;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class MovieSessionRequestDto {
    @NotNull(message = "Movie id must not be null")
    private Long movieId;
    @NotNull(message = "Cinema hall id must noy be null")
    private Long cinemaHallId;
    @NotEmpty(message = "Show time must not be empty")
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
