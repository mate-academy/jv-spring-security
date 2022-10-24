package mate.academy.spring.dto.request;

import jakarta.validation.constraints.NegativeOrZero;
import java.time.LocalDateTime;

public class MovieSessionRequestDto {
    @NegativeOrZero
    private Long movieId;
    @NegativeOrZero
    private Long cinemaHallId;
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
