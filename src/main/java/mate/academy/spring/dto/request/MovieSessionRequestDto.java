package mate.academy.spring.dto.request;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

public class MovieSessionRequestDto {
    @NotNull(message = "Movie id may not be null")
    private Long movieId;
    @NotNull(message = "Cinema hall id may noy be null")
    private Long cinemaHallId;
    @NotEmpty(message = "Show time may not be empty")
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
