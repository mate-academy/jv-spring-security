package mate.academy.spring.dto.request;

import javax.validation.constraints.Future;
import javax.validation.constraints.Positive;
import java.time.LocalDateTime;

public class MovieSessionRequestDto {
    @Positive
    private Long movieId;
    @Positive
    private Long cinemaHallId;
    @Future
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
