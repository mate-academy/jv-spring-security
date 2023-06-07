package mate.academy.spring.dto.request;

import java.time.LocalDateTime;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class MovieSessionRequestDto {

    @Size(min = 1)
    private Long movieId;
    @Size(min = 1)
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
