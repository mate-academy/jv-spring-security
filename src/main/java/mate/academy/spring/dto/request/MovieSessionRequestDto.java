package mate.academy.spring.dto.request;

import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

public class MovieSessionRequestDto {
    private Long movieId;
    private Long cinemaHallId;
    @NotNull
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
