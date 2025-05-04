package mate.academy.spring.dto.request;

import java.time.LocalDateTime;
import javax.validation.constraints.Future;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

public class MovieSessionRequestDto {
    @NotNull
    @Positive
    private Long movieId;
    @NotNull
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
