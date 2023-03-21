package mate.academy.spring.dto.request;

import java.time.LocalDateTime;
import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.Positive;

public class MovieSessionRequestDto {
    @Positive(message = "movie id should be positive")
    private Long movieId;

    @Positive(message = "cinema hall id should be positive")
    private Long cinemaHallId;

    @FutureOrPresent(message = "the date should be correct")
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
