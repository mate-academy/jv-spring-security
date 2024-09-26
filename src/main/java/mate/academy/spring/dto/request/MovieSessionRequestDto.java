package mate.academy.spring.dto.request;

import java.time.LocalDateTime;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

public class MovieSessionRequestDto {
    @NotNull(message = "please enter a movie ID.")
    @Positive
    private Long movieId;
    @NotNull(message = "Please enter a ID for cinema hall.")
    @Positive
    private Long cinemaHallId;
    @NotNull(message = "Please enter  time.")
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
