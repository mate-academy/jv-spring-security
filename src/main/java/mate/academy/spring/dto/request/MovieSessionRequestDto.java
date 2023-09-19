package mate.academy.spring.dto.request;

import java.time.LocalDateTime;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

public class MovieSessionRequestDto {
    @Positive(message = "Invalid movieId, value should be positive")
    private Long movieId;
    @Positive(message = "Invalid cinemaHallId, value should be positive")
    private Long cinemaHallId;
    @NotNull(message = "Invalid Id. Please fill in the date")
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
