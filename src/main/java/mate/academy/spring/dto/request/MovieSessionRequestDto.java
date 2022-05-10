package mate.academy.spring.dto.request;

import java.time.LocalDateTime;
import javax.validation.constraints.NotEmpty;

public class MovieSessionRequestDto {
    @NotEmpty
    private Long movieId;
    @NotEmpty
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
