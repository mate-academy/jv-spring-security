package mate.academy.spring.dto.request;

import java.time.LocalDateTime;
import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.NotNull;

public class MovieSessionRequestDto {
    @NotNull
    private Long movieId;
    @NotNull
    private Long cinemaHallId;
    @FutureOrPresent
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
