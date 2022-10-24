package mate.academy.spring.dto.request;

import java.time.LocalDateTime;
import javax.validation.constraints.NotNull;

public class MovieSessionRequestDto {
    @NotNull(message = "Please enter movieId")
    private Long movieId;
    @NotNull(message = "Please enter cinemaHallId")
    private Long cinemaHallId;
    @NotNull(message = "Please enter showTime")
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
