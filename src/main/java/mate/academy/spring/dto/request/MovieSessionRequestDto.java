package mate.academy.spring.dto.request;

import java.time.LocalDateTime;
import javax.validation.constraints.NotEmpty;

public class MovieSessionRequestDto {
    private Long movieId;
    private Long cinemaHallId;
    @NotEmpty
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
