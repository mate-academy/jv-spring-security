package mate.academy.spring.dto.request;

import java.time.LocalDateTime;
import javax.validation.constraints.Future;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class MovieSessionRequestDto {
    @NotNull
    @Min(value = 1)
    private Long movieId;
    @NotNull
    @Min(value = 1)
    private Long cinemaHallId;
    @NotNull
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
